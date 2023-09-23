package builder_pattern;

public class BuilderFactoryDemo {
    public static void main(String[] args) {

        MealBuilder vegBuilder = new MealBuilder();
        Meal vegMeal = vegBuilder.getVegMeal();
        MealBuilder nonVegBuilder = new MealBuilder();
        Meal nonVegMeal = nonVegBuilder.getNonVegMeal();
        System.out.println("*******VegMeal*******");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());
        System.out.println("********NonVegMeal********");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }

}
