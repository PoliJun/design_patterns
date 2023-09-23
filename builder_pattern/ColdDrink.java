package builder_pattern;

/**
 * ColdDrink
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

}