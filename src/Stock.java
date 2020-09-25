import java.util.HashMap;
public class Stock {

    HashMap<Inventory, Integer> inventory_and_amount = new HashMap<>(); //create a list of pairs (map)
    private Category category; //variable for creating stocks for each of category

    public Category getCategory() { return category;}

    public  Stock (Category category){ this.category = category;}



}
