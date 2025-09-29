package decorator.pattern;

public class MilkAddition extends CoffeeAddition {
    public MilkAddition(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 5.0d;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", he need some milk";
    }
}
