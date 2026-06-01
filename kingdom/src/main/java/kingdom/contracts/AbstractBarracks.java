package kingdom.contracts;

import kingdom.core.KingdomEntity;
import java.util.List;

public abstract class AbstractBarracks implements KingdomEntity {
    
    /**
     * Trains a new troop and adds them to the barracks.
     * @param troopName the name or type of the troop to train
     */
    public abstract void trainTroop(String troopName);

    /**
     * Gets a list of all currently trained troops stationed at the barracks.
     * @return list of troop names
     */
    public abstract List<String> getTroops();
}
