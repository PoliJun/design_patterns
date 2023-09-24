package bridge_pattern;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Circle greenCircle = new Circle(2, 3, 5, new GreenCircle());
        Circle redCircle = new Circle(7, 8, 9, new RedCircle());
        greenCircle.draw();
        redCircle.draw();
    }

}
