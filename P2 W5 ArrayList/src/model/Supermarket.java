package model;

import java.util.ArrayList;

/*You should have a Supermarket with the following attributes
Name
Location
No. Of Staff 
List of products stocked
*/
public class Supermarket {
	
	private String name, location;
	private int noStaff;
	private ArrayList<Product> inventory = new ArrayList<Product>();

	public Supermarket(String name, String location, int noStaff){
		this.name = name;
		this.location = location;
		this.noStaff = noStaff;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getLocation(){
		return this.location;
	}
	
	public int getNoStaff(){
		return this.noStaff;
	}
	
	public String toString(){
		String result = "";
		for(Product product: inventory) {
			result += product.toString();
		}
		return result;
	}

	public ArrayList<Product> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Product> inventory) {
		this.inventory = inventory;
	}
	
	
	
}
