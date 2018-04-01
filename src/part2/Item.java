package part2;

import java.text.NumberFormat;

public class Item {

	private double price;
	private String itemname;
	private String itemdesc;
	NumberFormat formatter = NumberFormat.getCurrencyInstance();

	public Item(String itemname, String itemdesc, double price) {

		this.itemname = itemname;
		this.itemdesc = itemdesc;
		this.price = price;
	}

	// Returns the item name
	public String getItemName() {
		return itemname;
	}

	// Returns the item description
	public String getItemDesc() {
		return itemdesc;
	}

	// Returns the price
	public double getPrice() {
		return price;
	}

	// Changes itemname value
	public void setItemName(String itemname) {
		this.itemname = itemname;
	}

	// Changes itemdesc value
	public void setItemDesc(String itemdesc) {
		this.itemdesc = itemdesc;
	}

	// Changes price
	public void setPrice(double price) {
		this.price = price;
	}

	// Returns itemname, itemdesc, and price
	public String toString() {
		return itemname + ", " + itemdesc + ", " + formatter.format(price);
	}

}
