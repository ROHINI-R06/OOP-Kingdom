package kingdom.contracts;

import kingdom.core.KingdomEntity;
import kingdom.entities.CityHall;

public interface FarmContract extends KingdomEntity {
    /**
     * Sets the CityHall to which this farm belongs.
     * 
     * @param cityHall The city hall that manages this farm.
     */
    void setCityHall(CityHall cityHall);

    /**
     * Gets the CityHall to which this farm belongs.
     * 
     * @return The managing CityHall.
     */
    CityHall getCityHall();
}
