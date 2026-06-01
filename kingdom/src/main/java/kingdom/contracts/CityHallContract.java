package kingdom.contracts;

import kingdom.core.KingdomEntity;
import java.util.List;

public interface CityHallContract extends KingdomEntity {
    /**
     * Registers a new entity to the city.
     * 
     * @param entity The entity to be registered.
     * @return A success or failure message.
     */
    String registerEntity(KingdomEntity entity);

    /**
     * Retrieves all entities currently registered in the city.
     * 
     * @return A list of KingdomEntities.
     */
    List<KingdomEntity> getCityEntities();
}
