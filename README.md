
# Restaurant Billing System
> 16 June  2024 Updated (Initial)
## Overview
The Restaurant Billing System is a console-based Java application designed to manage and generate bills for a restaurant. It prompts customers to select meal types (Lunch, Dinner, Starter), choose food items along with their quantities, and then generates a detailed invoice displaying the selected items and the total amount due. The system employs object-oriented programming principles for a clean and maintainable code structure.
## Features
- __Welcome Message:__ Displays a friendly welcome message to the customer.
- __Meal Type Selection:__  Allows the customer to choose between Lunch, Dinner, or Starter.
- __Menu Display:__ Shows the menu for the selected meal type along with item prices.
- __Item Selection:__ Customers can select food items and specify quantities.
- __Order Management:__ Adds selected items to the order list and allows multiple items to be added.
- __Invoice Generation:__ Calculates the total price and generates a formatted invoice.
## Technology
- Java OOPS Conceps
- Java Collection framework
## Project Structure
```
.
└── Restaurant_Billing_System/
    ├── src/
    │   └── main/
    │       └── java/
    │           └── restaurant/
    │               ├── model/
    │               │   ├── FoodItem.java
    │               │   ├── Order.java
    │               │   └── OrderItem.java
    │               ├── service/
    │               │   └── RestaurantBillingSystem.java
    │               └── admin/
    │                   └── [FUTURE SCOPE]
    ├── .gitignore
    └── README.md
```
## Example Output
```
-----INVOICE-----
Spring Rolls        |   2 |      11.98
Garlic Bread        |   3 |      11.97
Stuffed Mushrooms   |   6 |      41.94
Chicken Sandwich    |   2 |      15.98
Spaghetti           |  10 |     129.90
-------------------
Total:                          211.77

```
## Contributing
If you would like to contribute to this project, please fork the repository and create a pull request with your changes. For major changes, please open an issue first to discuss what you would like to change.

## Reference
[tree.nathanfriend.io](https://tree.nathanfriend.io/) - Very useful for creating project structure.