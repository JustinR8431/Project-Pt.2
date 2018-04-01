package part2;

import part2.Customer;
import part2.Item;
import java.util.Scanner;

public class CustomerDriver {

	public static void main(String[] args) {
		// Create boolean variable for our while loop
		boolean menu = true;

		// Create int variable for our customer selections
		int choice = 1;

		// Instantiate the scanner for user input
		Scanner scan = new Scanner(System.in);

		// Instantiate Customer class
		Customer customer = new Customer("Lebron", "James", "Quicken Loans Arena, OH");

		// Creates items our customer will chose from
		Item basketball = new Item("Basketball", "Put it in the hoop", 29.99);
		Item football = new Item("Football", "The old Pigskin", 24.99);
		Item baseball = new Item("Baseball", "Catch it with a glove", 15.64);
		Item soccerball = new Item("Soccer ball", "Just kick it", 12.99);
		Item curlingbroom = new Item("Curling broom", "Used for sweeping", 72.00);

		// While loop for menu options
		while (menu) {
			System.out.println("\n" + "Welcome to Justin's SportBall Shop!! \n  Please Buy Stuff from us...");
			System.out.println("\n" + "1 - View Your Profile");
			System.out.println("2 - View and Purchase Items from our Wide Selection of Sport Stuff");
			System.out.println("3 - Select something you didn't want? Remove it here.");
			System.out.println("4 - Go here to View your Shopping Cart");
			System.out.println("5 - Impulse Decisions are the worst, Go here to Empty your Shopping Cart.");
			System.out.println("6 - Done Shopping? Go here to exit the application.");
			choice = scan.nextInt();

			// If statement to make sure customer selects an available option
			if (choice < 1 || choice > 6) {
				System.out.println("Please enter a value from the menu");
			} else {
				// Switch statement to allow user to choose options
				switch (choice) {

				case 1:
					// Allows customer to see profile information
					System.out.println("\n" + "Here is your Customer Profile \n\n" + customer + "\n");
					break;
				case 2:
					// Shows user available items and prices
					System.out.println("Enter the Number of the Item you would like to Add \n Menu:");
					System.out.println("1: Basketball, 29.99");
					System.out.println("2: Football, 24.99");
					System.out.println("3: Baseball, 15.64");
					System.out.println("4: Soccer Ball, 12.99");
					System.out.println("5: Curling Broom, 72.00");
					choice = scan.nextInt();
					// If statement to make sure user only picks from available options
					if (choice < 1 || choice > 5) {

						System.out.println("Please enter an Item number from the menu.");
					} else {
						// Switch statement that allows customer to add items from the menu
						// The item the user selects on this screen is then added to the cart
						switch (choice) {

						case 1:
							customer.getCart().addItem(basketball);
							System.out.println("Basketball added to cart \n Ball is Life.");
							break;

						case 2:
							customer.getCart().addItem(football);
							System.out.println("Football added to cart \n May cause concussions.");
							break;

						case 3:
							customer.getCart().addItem(baseball);
							System.out.println("Baseball added to cart \n Chicks dig the long ball.");
							break;

						case 4:
							customer.getCart().addItem(soccerball);
							System.out.println("Soccer Ball added to cart \n Enjoy the beautiful game.");
							break;

						case 5:
							customer.getCart().addItem(curlingbroom);
							System.out.println("Curling Broom added to cart \n What even is Curling?");
							break;
						}
						break;
					}
					// This case shows the user the contents of the cart and ask which one they
					// would like to remove
				case 3:
					System.out.println("Here is your cart: ");
					System.out.println("\n" + customer.getCart());
					System.out.println("Which item would you like to remove? \n");
					System.out.println("1: Basketball, 29.99");
					System.out.println("2: Football, 24.99");
					System.out.println("3: Baseball, 15.64");
					System.out.println("4: Soccer Ball, 12.99");
					System.out.println("5: Curling Broom, 72.00");
					choice = scan.nextInt();
					// If statement to make sure user only selects from available options
					if (choice < 1 || choice > 5) {

						System.out.println("Please enter the number of the item you want to remove.");
					} else {
						// Switch statement to remove items from the cart
						switch (choice) {

						case 1:
							customer.getCart().removeItem(basketball);
							System.out.println("Basketball removed from cart.");
							break;

						case 2:
							customer.getCart().removeItem(football);
							System.out.println("Football removed from cart.");
							break;

						case 3:
							customer.getCart().removeItem(baseball);
							System.out.println("Baseball removed from cart.");
							break;

						case 4:
							customer.getCart().removeItem(soccerball);
							System.out.println("Soccer ball removed from cart.");
							break;

						case 5:
							customer.getCart().removeItem(curlingbroom);
							System.out.println("Curling Broom removed from cart.");
							break;
						}
						break;
					}
					// This case allows the user to view their cart and thier current total
				case 4:
					System.out.println("Here is your cart: \n");
					System.out.println(customer.getCart() + "\n");
					System.out.println("Your current total is " + customer.getCart().calculateTotal());
					break;
				// This case gives the user the option to empty the cart, or leave the cart
				// unchanged
				case 5:
					System.out.println("\n" + "Are you sure you want to Empty your Cart?");
					System.out.println("\n" + "Enter the number 1 to Empty your cart");
					System.out.println("Enter any other number to return to the previous screen");
					choice = scan.nextInt();
					// If Statement that flushes the cart if user enters a 1, any other number
					// returns to previous menu
					if (choice == 1) {
						customer.getCart().flushCart();
						System.out.println("\n" + "Your Cart has been Emptied");
					} else {
						System.out.println("\n" + "No Changes were made to your Cart");
						break;
					}
					break;

				case 6:
					// This case closes the while loop by changing the menu value to false
					menu = false;
					System.out.println("Thank You for Shopping with Justin's Sportball Shop!!!" + "\n");
					break;
				}

			}

		}
		scan.close();

		// Instantiate customer class // Set initial values
		Customer customer1 = new Customer("Joe", "Rockhead", "184 Holdthedoor Ln, Charlotte NC, 28222");

		// Print first name and last name and the city of the customer
		System.out
				.println(customer.getFirstName() + " " + customer.getLastName() + " lives in " + customer.getAddress());

		// Print the toString for initial customer values
		System.out.println(customer1);

		// Instantiate items using the item class
		Item game = new Item("Super Smash Bros", "Best game ever.", 60);
		Item beer = new Item("12 Pk. Coors Light", "Alcohol flavored water.", 12.99);
		Item pizza = new Item("Digiornos Pepperoni", "Rising Crust", 8.99);

		// Print item info
		System.out.println("\n" + game.getItemName() + " cost " + game.getPrice() + " dollars.");
		System.out.println(beer.getItemName() + " cost " + beer.getPrice() + " dollars." + "\n");

		// Print toString for initial game and pizza values
		System.out.println(game);
		System.out.println(pizza);

		// Set all initial values to new values
		customer.setFirstName("Coco");
		customer.setLastName("Jericho");
		customer.setAddress("853 Roundhouse Dr, Greenville SC, 29611");

		// Print the new customer name and the customers address
		System.out.println(
				"\n" + customer.getFirstName() + " " + customer.getLastName() + " lives in " + customer.getAddress());

		// Print the toString for the new customer values
		System.out.println(customer);

		// Change the game item
		game.setItemName("Call of Duty");
		game.setItemDesc("Same game every year.");
		game.setPrice(80);

		// Print toString for new values
		System.out.println("\n" + game.getItemName() + " cost " + game.getPrice() + " dollars because of DLC.");
		System.out.println(game);

		// Add Items to shopping cart
		customer.getCart().addItem(basketball);
		customer.getCart().addItem(game);

		customer1.getCart().addItem(beer);
		customer1.getCart().addItem(pizza);

		// View both customer carts
		System.out.println("\n" + "This is Coco's cart \n");
		System.out.println(customer.getCart());
		System.out.println("\n" + "Here is Joe's cart \n");
		System.out.println(customer1.getCart());

		// Show Calculatetotal for customer Coco
		System.out.println("\n" + "The total price of Coco's shopping cart is " + customer.getCart().calculateTotal());

		// Remove item from customer, and flush customer1's cart
		customer.getCart().removeItem(basketball);
		customer1.getCart().flushCart();

		// Show the contents of each cart after the removal of items
		System.out.println("\n" + "This is Coco's new cart \n");
		System.out.println(customer.getCart());
		System.out.println("\n" + "Here is Joe's new cart \n");
		System.out.println(customer1.getCart());
	}

}
