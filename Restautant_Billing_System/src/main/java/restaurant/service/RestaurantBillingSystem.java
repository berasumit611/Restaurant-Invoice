package restaurant.service;

import restaurant.model.*;
import java.util.Scanner;
import java.util.ArrayList;

//Acts as main user interface
public class RestaurantBillingSystem {
	
	private static ArrayList<FoodItem> starter=new ArrayList<FoodItem>();
	private static ArrayList<FoodItem> lunch=new ArrayList<FoodItem>();
	private static ArrayList<FoodItem> dinner=new ArrayList<FoodItem>();
	
	private static void initializeMenu() {
		starter.add(new FoodItem("Spring Rolls", 5.99));
	    starter.add(new FoodItem("Garlic Bread", 3.99));
	    starter.add(new FoodItem("Stuffed Mushrooms", 6.99));
	
	    lunch.add(new FoodItem("Chicken Sandwich", 7.99));
	    lunch.add(new FoodItem("Caesar Salad", 8.99));
	    lunch.add(new FoodItem("Grilled Cheese", 6.99));
	
	    dinner.add(new FoodItem("Steak", 14.99));
	    dinner.add(new FoodItem("Spaghetti", 12.99));
	    dinner.add(new FoodItem("Salmon", 13.99));
	//System.out.println(starter); [restaurant.model.FoodItem@2f92e0f4, restaurant.model.FoodItem@28a418fc, restaurant.model.FoodItem@5305068a]
	}
	
	public static void main(String[] args) {
		initializeMenu();
		Order order=new Order();
		Scanner scnRef=new Scanner(System.in);
		
		System.out.println("-----WELCOME TO THE LALIT RESTAURANT-----");
		
		while(true) {
			
		
			System.out.println("PLEASE CHOOSE AN OPTION: "
					+ "1. STARTER "
					+ "2. LUNCH "
					+ "3. DINNER "
					+ "4. EXIT");
			int choice=scnRef.nextInt();
			scnRef.nextLine();//consume newline
			
			if(choice==4) {
				System.out.println("-----EXIT-----");
				break;
			}
		
			//an empty ArrayList Here, selectedMenu is only declared as an ArrayList that can hold FoodItem objects
			ArrayList<FoodItem> selectedMenu=null;
			switch (choice) {
			case 1:
				selectedMenu=starter;
				break;
			case 2:
				selectedMenu=lunch;
				break;
			case 3:
				selectedMenu=dinner;
				break;	
			default:
				System.out.println("invalid choice. Please select again");
				continue;
				
			}
			
		//System.out.println(selectedMenu);[restaurant.model.FoodItem@2f92e0f4, restaurant.model.FoodItem@28a418fc, restaurant.model.FoodItem@5305068a]
			
			//display selected menu items
			System.out.println("-----MENU ITEMS-----");
			for(int i=0;i<selectedMenu.size();i++) {
				FoodItem item=selectedMenu.get(i);
//				System.out.println(item); restaurant.model.FoodItem@2f92e0f4
				System.out.println((i+1)+". "+ item.getName()+" - $"+item.getPrice());
			}
			
			//Item Selection and Quantity
			System.out.println("Enter the item number you want to order:");
			int itemNumber=scnRef.nextInt();
			if(itemNumber<1 || itemNumber>selectedMenu.size())
			{
				System.out.println("Invalid item number. Please select again");
				continue;
			}
			FoodItem selectedItem=selectedMenu.get(itemNumber - 1);
//			System.out.println(selectedItem);restaurant.model.FoodItem@2f4d3709
			
			System.out.println("Enter the quantity:");
			int quantity=scnRef.nextInt();
			scnRef.nextLine();
			
			//request order
			OrderItem orderItem=new OrderItem(selectedItem, quantity);
			//order multiple order to list
			order.addMultipleItems(orderItem);
			System.out.println("Item added to the order.");
		}
		
		order.printInvoice();
		scnRef.close();
		
	}
}
