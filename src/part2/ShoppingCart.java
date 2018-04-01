package part2;

import java.util.ArrayList;

public class ShoppingCart {

	// Creates the cart arraylist that will store our items
	ArrayList<Item> cart = new ArrayList<Item>();

	public ShoppingCart() {

	}

	// Adds an item to the cart
	public void addItem(Item itemname) {
		cart.add(itemname);
	}

	// Removes an item from the cart
	public void removeItem(Item itemname) {
		cart.remove(itemname);
	}

	// Removes all items from the cart
	public void flushCart() {
		cart.clear();
	}

	// Returns the number of items in the cart
	public int cartsize() {
		return cart.size();
	}

	// Returns the contents of the cart
	public String toString() {
		for (int contents = 0; contents < cart.size(); contents++)
			System.out.println(cart.get(contents));
		return " ";
	}

	// Calculates the price of items in the cart
	public double calculateTotal() {
		double total = 0;
		for (int contents = 0; contents < cart.size(); contents++)
			total += cart.get(contents).getPrice();
		return total;
	}
}
