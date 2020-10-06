public class DishTest {
    public static void main(String[] args){
        Dish dish1 = new Dish();
        dish1.costInCents = 650;
        dish1.nameOfDish = "Enchiladas";
        dish1.wouldRecommend = true;

        dish1.printSummary();

        System.out.println(DishTools.AVERAGE_COST_OF_DISH_IN_CENTS);


    }
}
