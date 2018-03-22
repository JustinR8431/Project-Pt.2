package part2;

public class Item {

	private double price;
	private String itemname;
	private String itemdesc;

	public Item(String itemname, String itemdesc, double price) {

		this.itemname = itemname;
		this.itemdesc = itemdesc;
		this.price = price;
	}

	public String getItemName() {
		return this.itemname;
	}

	public String getItemDesc() {
		return this.itemdesc;
	}

	public double getPrice() {
		return this.price;
	}

	public void setItemName(String itemname) {
		this.itemname = itemname;
	}

	public void setItemDesc(String itemdesc) {
		this.itemdesc = itemdesc;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return itemname + ", " + itemdesc + ", $" + price;
	}

}
