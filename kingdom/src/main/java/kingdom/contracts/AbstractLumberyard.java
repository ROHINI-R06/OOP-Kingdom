package kingdom.contracts;

import kingdom.core.KingdomEntity;

public abstract class AbstractLumberyard implements KingdomEntity {
    
    /**
     * Harvests wood from the nearby forest and adds it to the stockpile.
     */
    public abstract void harvestWood();

    /**
     * Retrieves the current amount of wood stored.
     * @return wood count
     */
    public abstract int getWoodStockpile();
}
