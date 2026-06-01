package kingdom.contracts;

import kingdom.core.KingdomEntity;

public abstract class AbstractMarket implements KingdomEntity {
    
    /**
     * Conducts a trade, increasing the total gold balance of the market.
     * @param tradeValue the amount of gold gained in the trade
     */
    public abstract void conductTrade(double tradeValue);

    /**
     * Retrieves the current available gold balance in the market.
     * @return gold balance
     */
    public abstract double getGoldBalance();
}
