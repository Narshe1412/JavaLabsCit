		/*
		 * Santa should be able to log hours for an elf.
Santa should be able to reset the hours for all elves with one action.
Santa should be able to print out his current wage bill. This should include
The pay due to each elf
The total pay due to all his elves.
Search for an elf by name and print out his name and hours.
Be able to quit the system.

		 * */

import java.util.Scanner;

public class SantaProgram {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String selectedOption = "loop";
		SantaMenu menu = new SantaMenu();

		System.out.println("Welcome Santa!");
		
		while (!selectedOption.equals("0")) {
			System.out.println("Please select one of the menu options: ");
			System.out.println("1. Log hours for an elf.");
			System.out.println("2. Reset hours logged for all elves.");
			System.out.println("3. Calculate wage bill.");
			System.out.println("4. Calculate total payment due.");
			System.out.println("5. List details for an elf.");
			System.out.println("Enter 0 to exit.");
			selectedOption = keyboard.next();
			switch (selectedOption) {
			case "1":
				menu.logHours();
				break;
			case "2":
				menu.resetAll();
				break;
			case "3":
				menu.calculateBill();				
				break;
			case "4":
				menu.calculateAll();
				break;
			case "5":
				menu.printElfDetails();
				break;
			case "0":
				//no "loop" assignment done, so the program will exit
				break;
			default:
				System.out.println("Wrong option chosen.");
				selectedOption = "loop";
			}
		}
		System.out.println("");
		System.out.println("Thanks for using Santa Organizer and Merry Xmas!");
	}

}
