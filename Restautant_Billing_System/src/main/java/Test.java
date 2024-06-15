import java.util.*;
class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Test {

	public static void main(String[] args) {
		List<Item> starters = new ArrayList<Item>();
		starters.addAll("Garlic Bread", 3.99);
        starters.addAll("Stuffed Mushrooms", 6.99);

        System.out.println(starters);
	}

}
