package grocerylistapp;

public class GroceryItem {

    private String itemName;
    private String itemCategory;
    private int itemQuantity;

    GroceryItem(String name, String category, int quantity) {
        this.itemName = name;
        this.itemCategory = category;
        this.itemQuantity = quantity;
    }
}
