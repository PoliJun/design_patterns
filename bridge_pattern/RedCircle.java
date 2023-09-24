package bridge_pattern;

/**
 * RedCircle
 */
public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing circle[color: Red, x: " + x + ", y: " + y + ", radius:" + radius + "]");
    }

}