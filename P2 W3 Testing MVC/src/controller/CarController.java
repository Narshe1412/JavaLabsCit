package controller;
import model.Car;

public class CarController {

	public static final int MAX_INVENTORY=20;
	Car[] inventory = new Car[MAX_INVENTORY];
	private int index = 0;

	
	public Boolean addCar(String make, String model, int year, Boolean sold){
		Boolean success = false;
		if (index >= MAX_INVENTORY) {
			System.out.println("Too many cars already on the system.");
		} else {
			inventory[index] = new Car(make, model, year, sold);
			index ++;
			success = true;
		}
		return success;
	}
	
	public void printAll(){
		System.out.println("Car Sales Inventory: ");
		for(int i = 0; i< index; i++) {
			System.out.println(i + ".  Make: " + inventory[i].getMake() + 
					" Model: " + inventory[i].getModel() + 
					" Year: " + inventory[i].getYear() + 
					" Sold? " + (inventory[i].isSold()? "Yes": "No"));
		}
	}
	
}
