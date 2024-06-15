package restaurant.model;

public class FoodItem {
	private String name;
	private double price;
	
	//constructor to initialize data when object craeted
	public FoodItem(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	//getters and setters public services
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	
}
