package abstract_factory_pattern;

/**
 * AbstractFactoryDemo
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        FactoryProducer producer = new FactoryProducer();
        AbstractFactory shapeFactory = producer.getFactory(false);
        AbstractFactory roundedShapeFactory = producer.getFactory(true);
        Shape square = shapeFactory.getShape("square");
        Shape rectangle = shapeFactory.getShape("rectangle");
        Shape roundedSquare = roundedShapeFactory.getShape("square");
        Shape roundedRectangle = roundedShapeFactory.getShape("rectangle");
        square.draw();
        rectangle.draw();
        roundedSquare.draw();
        roundedRectangle.draw();
    }
}