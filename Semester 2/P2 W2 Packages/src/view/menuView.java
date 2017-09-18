package view;

import java.io.*;

public class menuView {
	BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
	
	public void printMenu(){
		System.out.println("Please select a new option:");
		System.out.println("1. Add a person");
		System.out.println("2. Look up a person");
		System.out.println("3. Exit");
	}
	
	public int chooseOption() throws IOException{
		return Integer.parseInt(keyboard.readLine());
	}
	
	public String chooseName() throws IOException {
		System.out.println("Please enter a name: ");
		return keyboard.readLine();
	}
	
	public int chooseAge() throws IOException {
		int number = -1;
		while (number <= 0) {
			System.out.println("Please enter an age:");
			number = Integer.parseInt(keyboard.readLine());
			if(number <= 0) {
				System.out.println("Age too low.");
			} else {
				return number;
			}
		}
		return number;
	}
	
	public void printMessage(String message){
		System.out.println(message);
	}
}
