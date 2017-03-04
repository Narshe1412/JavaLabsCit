package model;

public class Car {
	private String make;
	private String model;
	private int year;
	private Boolean sold ;  
	
	public Car(String make, String model, int year, Boolean sold){
		this.make=make;
		this.model=model;
		this.year=year;
		this.sold=sold;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public Boolean isSold(){
		return this.sold;
	}

}


/*
 * For this lab the task is to write a Controller class and a Model class. We will not write any view and we 
 * will test our system using unit testing.
The system should manage a car sales business and be able to do the following :
The system should allow addition of a car. Each car should have the following information
Make
Model
Year
Sold (this should be a boolean)
No more than 20 cars are allowed in the system.
 
The system should allow retrieval of all cars in the system for display.
Unit test the system to ensure that it can cope with any scenario which can be thrown at it when adding a car.
Unit test the system to ensure that when a car is added it actually gets added to the system correctly.
When the controller encounters a situation it cannot cope with it should return an appropriate String message
 * 
 * */