package part2;

public class Customer {

	private String firstname;
	private String lastname;
	private String address;
	private ShoppingCart cart;

	public Customer(String firstname, String lastname, String address) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.cart = new ShoppingCart();
	}

	// Returns current firstname value
	public String getFirstName() {

		return firstname;
	}

	// Returns current lastname value
	public String getLastName() {

		return lastname;
	}

	// Returns current address value
	public String getAddress() {

		return address;
	}

	// Changes firstname to new value
	public void setFirstName(String firstname) {

		this.firstname = firstname;
	}

	// Changes lastname to new value
	public void setLastName(String lastname) {

		this.lastname = lastname;
	}

	// Sets address to new value
	public void setAddress(String address) {

		this.address = address;
	}

	// Returns firstname, lastname and address
	public String toString() {

		return firstname + " " + lastname + ", " + address;
	}

	// Adds shopping cart functions to the Customer class
	public ShoppingCart getCart() {
		return cart;
	}

}
