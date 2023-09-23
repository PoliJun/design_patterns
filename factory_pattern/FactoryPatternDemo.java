package factory_pattern;

/**
 * FactoryPatternDemo
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("Circle");
        Shape rectangle = factory.getShape("Rectangle");
        Shape square = factory.getShape("Square");
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}