package part2;

public class Customer {

	private String firstname;
	private String lastname;
	private String address;

	public Customer(String firstname, String lastname, String address) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}

	// Prints current firstname value
	public String getFirstName() {

		return firstname;
	}

	// Printes current lastname value
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

	// Sets value for Customer println
	public String toString() {

		return firstname + " " + lastname + " " + address;
	}

}
