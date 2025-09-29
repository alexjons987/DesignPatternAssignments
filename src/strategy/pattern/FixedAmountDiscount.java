package strategy.pattern;

import singleton.Logger;

public class FixedAmountDiscount implements DiscountStrategy {
    Logger logger = Logger.getInstance();

    @Override
    public double applyDiscount(double price) {
        double newPrice = price - 100;

        if (newPrice < 0) {
            logger.log(String.format("Fixed discount of -100 was applied! (%.2f -> 0)", price));
            return 0;
        }
        else {
            logger.log(String.format("Fixed discount of -100 was applied! (%.2f -> %.2f)", price, newPrice));
            return price - 100;
        }
    }
}
