package strategy.pattern;

import singleton.Logger;

public class PercentageDiscount implements DiscountStrategy {
    Logger logger = Logger.getInstance();

    @Override
    public double applyDiscount(double price) {
        double newPrice = price * 0.90d;

        logger.log(String.format("10%% discount was applied! (%.2f -> %.2f)", price, newPrice));
        return newPrice;
    }
}
