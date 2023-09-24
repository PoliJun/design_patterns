package prototype_pattern.practice;

public class ProtoTypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape cloneShape1 = ShapeCache.getShape("1");
        Shape cloneShape2 = ShapeCache.getShape("2");
        Shape cloneShape3 = ShapeCache.getShape("3");

        cloneShape1.draw();
        cloneShape2.draw();
        cloneShape3.draw();
    }
}
