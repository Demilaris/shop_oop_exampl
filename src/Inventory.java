import java.util.Date;

enum Category           //create enum for categories in inventory
{
    CLOTHES,
    FOOD,
    PHARMACY
}

public class Inventory {

    private String name;

    public Date getCreate_date() {
        return create_date;
    }

    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    private Date create_date;
    private Category category;
    private int price;

    public String getName() {
        return name;
    }   // getting the method name as a string

    public Inventory(String name, Date create_date, int price) {
        name = name;
        create_date = create_date;
        price = price;
    }


}
