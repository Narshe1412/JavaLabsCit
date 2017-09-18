package model;
/*Name 
Barcode
Price
Amount of the item currently in stock
*/

public class Product {
	private String name, barcode;
	private double price;
	private int stock;
	
	public Product(String name, String barcode, double price, int stock) {
		this.name = name;
		this.barcode = barcode;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String toString(){
		return this.name + " " + this.barcode + " " + "Stock: " + this.stock + " at price " + this.price;
	}

}
