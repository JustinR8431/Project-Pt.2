package part2;

import part2.Customer;
import part2.Item;

public class CustomerDriver {

	public static void main(String[] args) {
		// Instantiate customer class
		// Set initial values
		Customer customer = new Customer("Joe", "Rockhead", "184 Holdthedoor Ln, Charlotte NC, 28222");

		// Print first name and last name and the city of the customer
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " lives in " + customer.getAddress());

		// Print the toString for initial customer values
		System.out.println(customer);

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
		System.out.println("\n" + customer.getFirstName() + " " + customer.getLastName() + " lives in " + customer.getAddress());

		// Print the toString for the new customer values
		System.out.println(customer);

		// Change the game item
		game.setItemName("Call of Duty");
		game.setItemDesc("Same game every year.");
		game.setPrice(80);

		// Print toString for new values
		System.out.println("\n" + game.getItemName() + " cost " + game.getPrice() + " dollars because of DLC.");
		System.out.println(game);

	}

}
