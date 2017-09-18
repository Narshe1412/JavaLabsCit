package controller;

import java.io.IOException;
import java.util.ArrayList;

import model.personModel;
import view.menuView;

public class personController {

	ArrayList<personModel> people = new ArrayList<personModel>();
	
	menuView menu = new menuView();
	
	public String Add() throws IOException{
		String name = menu.chooseName();
		int age = menu.chooseAge();
		people.add(new personModel(name, age));
		return "Added " + name + " with an age of " + age;
	}
	

	public String Lookup() throws IOException {
		menu.printMessage("Select the index you want to retrieve: ");
		int pos = menu.chooseOption(); 
		if (pos > people.size()){ //position should be less than the array
			return "Position does not exist. Please choose a number below " + (people.size());
		} else { //human wont use pos 0 so substract 1 to his selection
			return "We have found " + people.get(pos-1).getName() +
					" that has an age of " + people.get(pos-1).getAge();
		}
	}
	
}
