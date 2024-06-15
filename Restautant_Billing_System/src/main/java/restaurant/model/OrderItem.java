package restaurant.model;

public class OrderItem {
	private FoodItem item;
	private int quantity;
	
	//initialize particular food item
	public OrderItem(FoodItem item,int quantity)
	{
		this.item=item;
		this.quantity=quantity;
	}
	//access particular food item
	public FoodItem getItem()
	{
		return item;				
	}
	public int getQuantity()
	{
		return quantity;
	}
	//access total price of a food
	public double getTotalPrice()
	{
		return item.getPrice()*quantity;
	}
}