package builder_pattern;

public class MealBuilder {
    public Meal getNonVegMeal() {
        Meal nonVegMeal = new Meal();
        nonVegMeal.addItem(new NonVegBurger());
        nonVegMeal.addItem(new Coke());
        return nonVegMeal;
    }

    public Meal getVegMeal() {
        Meal vegMeal = new Meal();
        vegMeal.addItem(new VegBurger());
        vegMeal.addItem(new Pepsi());
        return vegMeal;
    }
}
