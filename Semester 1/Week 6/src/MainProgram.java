//		MainProgramshould contain the have three private constants for the three menu options
//
//		It should do the following :
//
//		Display a menu to the user asking if they want to :
//		Play The Game
//		Print Highscore
//		Exit.
//		A Scanner should be used to capture the users input when choosing an option
//		A while loop should keep running allowing them to keep choosing 1 or 2 as they wish. 
			//Once they enter 3 the program should exit.
//		A switch statement should be provided within the while loop to process the users choice
//		It should create an instance of TheGame in main and call its methods as appropriate.
//		If the user enters an invalid option (i.e. Not 1,2 or 3) they should get this message 
			//"You have entered an invalid option."
import java.util.Scanner;

public class MainProgram {
	
	public static final String MENU_PLAY = "1",
			MENU_HIGHSCORE = "2",
			MENU_EXIT = "3";
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String menuOption = "";
		System.out.println("Welcome to THE GAME!!! (sorry, you just lost it)");//greetings
		TheGame theGame = new TheGame();

		while (!menuOption.equals(MENU_EXIT)) { // we will enter the loop UNLESS the user does not want
			theGame.printMenu();
			System.out.println("Please enter (" + MENU_PLAY + ", " + MENU_HIGHSCORE + " or " + MENU_EXIT + "): "); //we make sure the user is asked for the proper command, otherwise = Loop
			menuOption = keyboard.next();
			
			switch (menuOption) {
			case MENU_PLAY:
				System.out.println(theGame.playTheGame());
				break;
			case MENU_HIGHSCORE:
				theGame.printNoOfGuessesInARowwhich();
				break;
			case MENU_EXIT:
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("You have entered an invalid option.");
			};
			System.out.println(""); //line break for display purposes
	
		}
	}
}
