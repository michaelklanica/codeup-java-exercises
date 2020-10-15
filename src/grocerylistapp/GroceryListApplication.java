package grocerylistapp;

import util.Input;

import java.util.HashMap;

public class GroceryListApplication {
    public static void main(String[] args) {


        Input userInput = new Input();
        String foodCategory = "";
        System.out.println("Choose from the following item categories:");
        System.out.println("1. Produce\n2. Frozen\n3. Meat\n4. Dairy\n5. Dry Goods\n6. Bakery");
        int input = userInput.getInt(1,6, "enter a number");
        switch (input) {
            case 1:
                System.out.println("Add some produce...");
                foodCategory = "produce";
                break;
            case 2:
                System.out.println("Add some frozen foods...");
                foodCategory = "frozen";
                break;
            case 3:
                System.out.println("Add some meats...");
                foodCategory = "meat";
                break;
            case 4:
                System.out.println("Add some dairy products...");
                foodCategory = "dairy";
                break;
            case 5:
                System.out.println("Add some dry goods...");
                foodCategory = "dry";
                break;
            case 6:
                System.out.println("Add some baked goods...");
                foodCategory = "bakery";
                break;

            default:
                break;
        }


        System.out.println("What item would you like to add?");
        String item = userInput.getString();
        System.out.println("how many?");
        int quantity = userInput.getInt();

        HashMap<String, GroceryItem> groceryList = new HashMap<>();
        groceryList.putIfAbsent(item, new GroceryItem(item, foodCategory, quantity));

        System.out.println("groceryList = " + groceryList);

    }

}
