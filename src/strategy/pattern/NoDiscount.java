package strategy.pattern;

import singleton.Logger;

public class NoDiscount implements DiscountStrategy {
    Logger logger = Logger.getInstance();

    @Override
    public double applyDiscount(double price) {
        logger.log(String.format("No discount was applied! (%.2f -> %.2f)", price, price));
        return price;
    }
}
