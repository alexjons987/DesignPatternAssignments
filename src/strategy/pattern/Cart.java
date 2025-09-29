package strategy.pattern;

public class Cart {
    public double calculateDiscount(DiscountStrategy discountStrategy, double price) {
        return discountStrategy.applyDiscount(price);
    }
}
