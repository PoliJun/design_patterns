package factory_pattern;

public class ShapeFactory {
    public Shape getShape(String shapeName) {
        if (shapeName.equals("Rectangle")) {
            return new Rectangle();
        } else if (shapeName.equals("Circle")) {
            return new Circle();
        } else if (shapeName.equals("Square")) {
            return new Square();
        }
        return null;
    }
}