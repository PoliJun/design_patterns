package builder_pattern;

/**
 * VegBurger
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";

    }

    @Override
    public float price() {
        return 35.0f;
    }

}