package kingdom.contracts;

import kingdom.core.KingdomEntity;

public abstract class AbstractBlacksmith implements KingdomEntity {
    
    /**
     * Forges a new weapon, incrementing the weapon count.
     * Can also change the status of the Blacksmith to DAMAGED if overused.
     */
    public abstract void forgeWeapon();

    /**
     * Gets the total number of weapons forged by this Blacksmith.
     * @return weapon count
     */
    public abstract int getWeaponCount();
    
    /**
     * Repairs the blacksmith, returning status to OPERATIONAL.
     */
    public abstract void repairAnvil();
}
