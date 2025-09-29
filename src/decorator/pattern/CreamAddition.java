package decorator.pattern;

public class CreamAddition extends CoffeeAddition {
    public CreamAddition(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 5.0d;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", cream";
    }
}
