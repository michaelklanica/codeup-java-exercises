public class DishTools {
    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 13000;

    public static void shoutDishName(Dish d) {
        System.out.println(d.nameOfDish.toUpperCase());
    }
    public static void analyzeDish(Dish d){
        String message = (d.costInCents < AVERAGE_COST_OF_DISH_IN_CENTS) ? "Less than average" : "more than average";
    }

    public static void flipRecommendation(Dish d) {

    }
}
