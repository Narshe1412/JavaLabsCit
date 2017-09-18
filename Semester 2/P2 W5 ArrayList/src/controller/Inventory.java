package controller;

import java.util.ArrayList;

import model.Product;
import model.Supermarket;

public class Inventory {

	Supermarket supermarket = new Supermarket("Spar tacus", "Cork", 20);
	
	public void addProduct(String name, String barcode, double price, int stock) {
		Product p = new Product(name, barcode, price, stock);
		supermarket.getInventory().add(p);
	}
	
	public void removeProduct(String barcode){
		int index=-1;
		for(Product p : supermarket.getInventory()) {
			if (p.getBarcode().equals(barcode)) {
				index = supermarket.getInventory().indexOf(p);
			}
		}
		supermarket.getInventory().remove(index);
	}
	
	public ArrayList<Product> searchProduct(String name) {
		
		for (Product p: supermarket.getInventory()) {
			
		}
		
		return null;
		
	}
}
