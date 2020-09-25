import java.util.Date;

public class Clothes extends Inventory {
    private int size;
    public int getSize() {return size; }
    public Clothes(String name, Date create_date, int price) {
        super(name, create_date, price);

    }

}
