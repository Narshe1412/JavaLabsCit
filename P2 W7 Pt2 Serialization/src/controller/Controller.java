package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.People;
import model.Person;

public class Controller {

	private People people = new People();
	private static final String PATH = "savedata.dat";
	
	public void addPerson(String name, int age){
		Person person = new Person(name, age);
		this.people.getCollection().add(person);
		}
	
	public void saveFile(){
		
		try {
			File path = new File(PATH);
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.people);
			oos.close();
			System.out.println("File has been saved successfully");
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	public void printPeople(){
		if (this.people.getCollection().size() == 0) {
			System.out.println("No people stored in the database");
		} else {
			for(Person person: this.people.getCollection()){
				System.out.println("Name: " + person.getName() + " Age: " + person.getAge());
			}
		}
	}
	
	public void loadFile() {
		File path = new File(PATH);
		if (path.exists()) {
			try {
				
				FileInputStream fis = new FileInputStream(path);
				ObjectInputStream ois = new ObjectInputStream(fis);
				this.people = (People)ois.readObject();
				ois.close();
				System.out.println("Details from the file have been loaded successfully");
				
			} catch (IOException | ClassNotFoundException e){
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("No file to load.");
		}
	}

}
