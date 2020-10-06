public class Dish {

    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public void printSummary() {
        System.out.printf("Cost: " + costInCents + "\nName: " + nameOfDish + "\nWould Recommend: " + wouldRecommend);
    }
}


