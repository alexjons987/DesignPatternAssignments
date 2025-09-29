package decorator.pattern;

public class SugarAddition extends CoffeeAddition {
    public SugarAddition(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 5.0d;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", sugar";
    }
}
