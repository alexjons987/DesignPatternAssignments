package strategy.pattern;

import singleton.Logger;

public class Cart {
    Logger logger = Logger.getInstance();
    DiscountStrategy discountStrategy = new NoDiscount();

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        logger.log("Setting discount strategy to: " + discountStrategy.getClass().toString());
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount(double price) {
        return this.discountStrategy.applyDiscount(price);
    }
}
