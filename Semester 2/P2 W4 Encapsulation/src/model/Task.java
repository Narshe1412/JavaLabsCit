package model;
//  A Task should store a name and the time it will take in hours.

public class Task {
	
	private String name;
	private int hours;
	
	public Task (String name, int hours) {
		this.setName(name);
		this.setHours(hours);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String toString(){
		return this.getName() + " " + this.getHours();
	}
}
