package builder_pattern;

/**
 * Coke
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";

    }

    @Override
    public float price() {
        return 3.5f;
    }

}