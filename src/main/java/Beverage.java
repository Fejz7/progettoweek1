
public class Beverage extends MenuItem {
    private String size;

    public Beverage(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
