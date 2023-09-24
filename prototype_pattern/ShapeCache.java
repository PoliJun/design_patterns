package prototype_pattern;

import java.util.Hashtable;

/**
 * ShapeCache
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeid) {
        Shape shapeCache = shapeMap.get(shapeid);
        return (Shape) shapeCache.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);
        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);
        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }

}