package model;

import java.io.Serializable;
import java.util.ArrayList;

public class People implements Serializable{
	
	private ArrayList<Person> collection;


	public People(){
		this.collection = new ArrayList<Person>();
	}
	
	public ArrayList<Person> getCollection() {
		return this.collection;
	}

	public void setCollection(ArrayList<Person> collection) {
		this.collection = collection;
	}

	

}
