import java.util.Random;
import java.util.Scanner;

//TheGameshould declare and instantiate the following variables at class level
//
//An int variable to store the randomly generated number
//An int variable to store the number of correct guesses in a row
//A Random variable to store the instance of the Random class.
//A public static final int constant to store the MAX_NUMBER random number which is possible in the game
//TheGameshould also have three methods which do the following
//
//A public method called playTheGame which starts the game for the user. 
//		It should prompt them for their guess, generate a random number and print out a result.
//A public method called printNoOfGuessesInARowwhich prints the number of guesses which they 
//		have guessed correctly in a row ANDalso prints the last number which they guessed correctly
//A public method called printMenu which prints the menu to user and takes no parameter and returns nothing.

public class TheGame {
	public static final int MAX_NUMBER = 5; // Maximum number to guess, edit for more/less difficulty
	
	private int rngToGuess = 0;
	private int correctGuesses = 0;
	Random rng = new Random();
	Scanner keyboard = new Scanner(System.in);
	
	public String playTheGame() {
		rngToGuess = rng.nextInt(MAX_NUMBER) + 1;
		int numberTried = 0;
		
		System.out.println("I'm thinking on a number. Can you guess which one is it? (from 1 to " + (MAX_NUMBER) + ")");
		numberTried = keyboard.nextInt();

		if (numberTried == rngToGuess) {
			correctGuesses++;
			return "You guessed correctly, good job!";
		} else {
			correctGuesses = 0;
			return "Too bad, you lost, and I'm just getting warmed up!";
		}
	}
	
	public void printNoOfGuessesInARowwhich() {
		System.out.println("Your current score is " + correctGuesses + " numbers guessed in a row.");
		System.out.println(rngToGuess == 0? "Play the game at least once to get some sweet scores." : "The last number you guessed correctly is "+ rngToGuess + ".");
	}
	
	public void printMenu(){
		System.out.println("Please select an option:");
		System.out.println(MainProgram.MENU_PLAY + ". Guess a number game.");
		System.out.println(MainProgram.MENU_HIGHSCORE + ". Print the score you've achieved so far.");
		System.out.println(MainProgram.MENU_EXIT + ". Exit.");
	}
}
