package view;

import java.util.Scanner;

import controller.Controller;

public class Menu {

	private Controller program = new Controller();
	
	public void showMenu(){
		System.out.println("");
		System.out.println("------------------------------");
		System.out.println("Please select an option:");
		System.out.println("");
		System.out.println("1. Enter details about person");
		System.out.println("2. Save");
		System.out.println("3. Print all people");
		System.out.println("4. Load");
		System.out.println("5. Exit");
		System.out.println("------------------------------");
		System.out.println("");
	}
	
	public int getOption(){
		Scanner sc = new Scanner(System.in);
		boolean isNotValid = true;
		int selected =-1;
		
		while (isNotValid) {
			selected = Integer.parseInt(sc.next());
			if (selected > 0 && selected <= 5) isNotValid = false;
		}
		
		return selected;
	}
	
	public boolean loadOption(int selected){

		switch(selected){
			case 1: //add
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter a new person name: ");
				String name = sc.next();
				System.out.println("Please enter " + name + "'s age: ");
				int age = Integer.parseInt(sc.next());
				program.addPerson(name, age);
				break;
			case 2: //save
				program.saveFile();
				break;
			case 3: //print
				program.printPeople();
				break;
			case 4: //load
				program.loadFile();
				break;
			case 5:
				System.out.println("Thanks for playing!");
				return false;
			default:
				System.out.println("Invalid option. Please select an option 1-5");
				break;
			}
		return true;
	}
}

