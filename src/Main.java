import factory.method.Shape;
import factory.method.ShapeFactory;
import observer.pattern.AnotherUserClass;
import observer.pattern.NewsAgency;
import observer.pattern.User;
import singleton.Logger;
import strategy.pattern.Cart;
import strategy.pattern.FixedAmountDiscount;
import strategy.pattern.NoDiscount;
import strategy.pattern.PercentageDiscount;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Singleton
        Logger logger = Logger.getInstance();

        logger.log("Hi mate, in the console");

        logger.log("Getting CWD...");
        String cwd = System.getProperty("user.dir");

        logger.log("Setting up file reference...");
        File file = new File(cwd, "SingletonAssignment.log");

        logger.setPath(file);
        logger.log(String.format("Logger path changed to %s!", file.getAbsolutePath()));

        logger.log("Hi mate, but in a file");

        // Factory Method
        ShapeFactory sf = new ShapeFactory();

        Shape shapeA = sf.createShape("circle");
        Shape shapeB = sf.createShape("square");
        Shape shapeC = sf.createShape("rectangle");

        shapeA.draw();
        shapeB.draw();
        shapeC.draw();

        // Observer Pattern
        NewsAgency newsAgency = new NewsAgency();

        User userA = new User("A");
        User userB = new User("B");
        AnotherUserClass anotherUserC = new AnotherUserClass("C");
        AnotherUserClass anotherUserD = new AnotherUserClass("D");

        newsAgency.addObserver(userA);
        newsAgency.addObserver(userB);
        newsAgency.addObserver(anotherUserC);
        newsAgency.addObserver(anotherUserD);

        newsAgency.publishNews("Yo and Gurt are back to being friends!");

        // Strategy Pattern
        double priceOfGenericItem = 367.0d;

        logger.log("Creating new Cart instance (default: no discount)...");
        Cart cart = new Cart();
        cart.calculateDiscount(priceOfGenericItem);

        cart.setDiscountStrategy(new FixedAmountDiscount());
        cart.calculateDiscount(priceOfGenericItem);

        cart.setDiscountStrategy(new PercentageDiscount());
        cart.calculateDiscount(priceOfGenericItem);
    }
}