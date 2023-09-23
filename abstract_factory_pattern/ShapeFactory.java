package abstract_factory_pattern;

/**
 * ShapeFactory
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeName) {
        if (shapeName.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeName.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }

}