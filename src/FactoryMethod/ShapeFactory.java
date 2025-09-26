package FactoryMethod;

public class ShapeFactory {
    public Shape createShape(String type) {
        return switch (type.toLowerCase()) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            case "rectangle" -> new Rectangle();
            default -> throw new IllegalArgumentException("No valid shape given.");
        };
    }
}
