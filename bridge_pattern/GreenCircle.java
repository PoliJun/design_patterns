package bridge_pattern;

/**
 * GreenCircle
 */
public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing Circle[Color: Green, radius: " + radius + " x: " + x + " y: " + y + "]");
    }

}