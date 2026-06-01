package kingdom.core;

import java.util.ArrayList;
import java.util.List;

public class KingdomRegistry {
    private static final List<Class<? extends KingdomEntity>> registeredEntities = new ArrayList<>();

    public static void register(Class<? extends KingdomEntity> entityClass) {
        if (!registeredEntities.contains(entityClass)) {
            registeredEntities.add(entityClass);
            System.out.println("Registered blueprint: " + entityClass.getSimpleName());
        }
    }

    public static List<Class<? extends KingdomEntity>> getRegisteredEntities() {
        return registeredEntities;
    }
}
