package bridge_pattern;

/**
 * Circle
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawApi api) {
        super(api);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(x, y, radius);
    }

}