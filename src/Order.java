import java.util.Date;

public class  Order {
    private Date date;
    private String inventory;
    private Consumer consumer;
    private Customer customer;
    private int price;
    private int amount;

    public Order(Date date,String inventory,Consumer consumer,Customer customer, int price, int amount)
    {
        this.date = date;
        this.inventory = inventory;
        this.consumer = consumer;
        this.customer = customer;
        this.price = price;
        this.amount = amount;

    }

}

