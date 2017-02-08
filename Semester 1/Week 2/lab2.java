import java.util.Scanner;

public class lab2 {
	/*
	Write a program which does the following

	Asks the user how many countries they have visited ?
	Create a String array which is capable of storing all the countries names.
	Populate this array by asking the user to supply the country names one by one.
	Now ask the user to grade each country out of 10.(These scores should be stored in an int array)
	If for example they entered "Australia", "Spain" and "America" they should be prompted with the following type of question when scoring each country

	What is your score out of 10 for Australia ?
	What is your score out of 10 for Spain ?
	What is your score out of 10 for America ?
	Print out the average score for all the countries they have visited. The message should be of the format "You have visited 3 countries and the average score is 7".
	*/

	public static void main (String[] args) {
		int numberOfCountries;
		String[] countryNames;
		int[] countryRates;
		float averageScore = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many countries have you visited? ");
		numberOfCountries = keyboard.nextInt();
		
		countryNames = new String[numberOfCountries];
		countryRates = new int[numberOfCountries];
		
		for (int i=0; i<countryNames.length; i++) { //numerOfCountries is also acceptable for break condition
			System.out.println("What's the name of the " + (i+1) + "th country? ");
			countryNames[i] = keyboard.next();
		};
		
		for (int j=0; j<countryRates.length; j++) { //numerOfCountries is also acceptable for break condition
			System.out.println("Please rate the score out of 10 for " + countryNames[j] + ": ");
			countryRates[j] = keyboard.nextInt();
			averageScore += countryRates[j]; // start acumulating values
		};
		
		averageScore /= numberOfCountries; //real average
		
		System.out.println("");
		System.out.println("You have visited " + numberOfCountries + " countries and the average score for all countries is " + averageScore + ".");
	}	
}
/* TODO
Round the average result
Capitalize first letter of country
Don't allow numeric values for countryname or text values for scores
Validate scores to be >=0 and <= 10
Allow user break at any time
*/