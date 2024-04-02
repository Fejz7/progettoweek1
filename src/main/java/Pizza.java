import java.util.List;

// Classe per le pizze
public class Pizza extends MenuItem {
    private List<Topping> toppings;

    public Pizza(String name, double price, List<Topping> toppings) {
        super(name, price);
        this.toppings = toppings;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
}
