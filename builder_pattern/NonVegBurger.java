package builder_pattern;

/**
 * NonVegBurger
 */
public class NonVegBurger extends Burger {

    @Override
    public String name() {
        return "NonVegBurger";
    }

    @Override
    public float price() {
        return 30.0f;
    }

}