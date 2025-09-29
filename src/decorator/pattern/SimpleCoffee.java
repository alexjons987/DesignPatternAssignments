package decorator.pattern;

public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "POV: I'm a simple coffee.";
    }
}
