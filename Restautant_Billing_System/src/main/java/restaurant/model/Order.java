package restaurant.model;
import java.util.ArrayList;

public class Order {
	private ArrayList<OrderItem> orderItems;
	
	public Order() {
		orderItems=new ArrayList<OrderItem>();
	}
	
	//order multiple order to list
	public void addMultipleItems(OrderItem orderItem)
	{
		orderItems.add(orderItem);
	}
	//iterate through loop and for individual item finally calculate total bill
	public double getTotal() {
		double total=0;
		for(OrderItem eachOrderItem : orderItems)
		{
			total +=eachOrderItem.getTotalPrice();
		}
		return total;
	}
//	public void printInvoice() {
//		System.out.println("-----INVOICE-----");
//		
//			for(OrderItem eachOrderItem : orderItems ) {
//				System.out.println(eachOrderItem.getItem().getName()+" X "+eachOrderItem.getQuantity()+" = "+eachOrderItem.getTotalPrice());
//			}
//			
//		System.out.println("-------------------");
//		System.out.println("Total: "+getTotal());
//	}
//	
	public void printInvoice() {
	    System.out.println("-----INVOICE-----");
	    
	    // Define the format for the invoice lines
	    String format = "%-20s | %3d | %10.2f%n";
	    
	    // Print each order item
	    for (OrderItem eachOrderItem : orderItems) {
	        String itemName = eachOrderItem.getItem().getName();
	        int quantity = eachOrderItem.getQuantity();
	        double totalPrice = eachOrderItem.getTotalPrice();
	        
	        System.out.printf(format, itemName, quantity, totalPrice);
	    }
	    
	    System.out.println("-------------------");
	    System.out.printf("Total: %33.2f%n", getTotal());
	}
}
