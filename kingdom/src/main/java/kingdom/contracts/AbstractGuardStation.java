package kingdom.contracts;

import kingdom.core.KingdomEntity;

public abstract class AbstractGuardStation implements KingdomEntity {

    public abstract void assignPatrol(String districtName);

    public abstract int getActivePatrolCount();

    public abstract String coordinateResponse();
}
