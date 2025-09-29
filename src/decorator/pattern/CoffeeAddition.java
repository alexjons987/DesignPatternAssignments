package decorator.pattern;

public abstract class CoffeeAddition implements Coffee {
    protected Coffee coffee;

    public CoffeeAddition(Coffee coffeeAddition) {
        this.coffee = coffeeAddition;
    }

    public double getCost() {
        return this.coffee.getCost();
    }

    public String getDescription() {
        return this.coffee.getDescription();
    }
}
