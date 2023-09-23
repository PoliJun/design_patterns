package abstract_factory_pattern;

/**
 * RoundedShapeFactory
 */
public class RoundedShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeName) {
        if (shapeName.equalsIgnoreCase("Rectangle")) {
            return new RoundedRectangle();
        } else if (shapeName.equalsIgnoreCase("Square")) {
            return new RoundedSquare();
        }
        return null;
    }

}