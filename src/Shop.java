import java.util.ArrayList;

public class Shop {
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String name;
    private String location;

    private ArrayList<Consumer> consumers;
    private ArrayList<Customer> customers;

    private ArrayList<Order> orders = new ArrayList<>();

    public Shop(String name, String location)
    {
        this.name = name;
        this.location = location;
        this.consumers = new ArrayList<Consumer>();
        this.customers = new ArrayList<Customer>();
    }

    public void list_of_consumers()
    {
        Customer client_1 = new Customer("Stasy",46,'F');
        Customer client_2 = new Customer("Mark",35,'M');


        customers.add(client_1);
        customers.add(client_2);

        for (int i = 0; i < customers.size(); ++i) {
            System.out.println("Name: " + customers.get(i).getName() + " Age:" + customers.get(i).getAge() + " Gender: " + customers.get(i).getGender());//hj
        }

    }



}
