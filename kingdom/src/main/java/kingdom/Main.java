package kingdom;

import kingdom.core.KingdomEntity;
import kingdom.core.KingdomRegistry;
import kingdom.entities.CityHall;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        StateManager stateManager = new StateManager();

        System.out.println("Booting static entity registries...");
        Reflections reflections = new Reflections("kingdom.entities");
        Set<Class<? extends KingdomEntity>> entityClasses = reflections.getSubTypesOf(KingdomEntity.class);
        for (Class<? extends KingdomEntity> clazz : entityClasses) {
            if (!Modifier.isAbstract(clazz.getModifiers()) && !clazz.isInterface()) {
                try {
                    Class.forName(clazz.getName(), true, clazz.getClassLoader());
                } catch (ClassNotFoundException e) {
                    System.err.println("Could not auto-register: " + clazz.getName());
                }
            }
        }

        // Attempt to load the pre-existing state
        Kingdom kingdom = stateManager.loadKingdom();

        if (kingdom.getCities().isEmpty()) {
            CityHall firstCity = new CityHall("CITYHALL-001", "First Settlement");
            kingdom.addCity(firstCity);
            System.out.println("Built default starting kingdom setup.");
        } else {
            System.out.println("Kingdom state has " + kingdom.getCities().size() + " active cities.");
        }

        // Reconcile Registry with active kingdom state
        CityHall mainCity = kingdom.getCities().get(0);
        for (Class<? extends KingdomEntity> blueprint : KingdomRegistry.getRegisteredEntities()) {
            if (blueprint.equals(CityHall.class))
                continue; // Handled separately

            boolean exists = mainCity.getCityEntities().stream()
                    .anyMatch(entity -> entity.getClass().equals(blueprint));

            if (!exists) {
                try {
                    System.out.println("Injecting newly registered blueprint: " + blueprint.getSimpleName());
                    KingdomEntity newEntity = blueprint.getDeclaredConstructor().newInstance();

                    // Specific interface handlers
                    if (newEntity instanceof kingdom.contracts.FarmContract) {
                        ((kingdom.contracts.FarmContract) newEntity).setCityHall(mainCity);
                    }

                    mainCity.registerEntity(newEntity);
                } catch (Exception e) {
                    System.err.println("Failed to instantiate auto-wired entity: " + blueprint.getSimpleName());
                }
            }
        }

        // Save the execution back to JSON
        stateManager.saveKingdom(kingdom);
    }
}
