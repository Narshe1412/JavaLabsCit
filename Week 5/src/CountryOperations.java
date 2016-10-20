/*
 CountryOperations should have three methods which do the following

A public method called calculateAverageCountryLength which calculates the average country name length 
	and take the countryArray as a parameter and returns an int.
A public method called getNumberOfCountriesBeginngWithLetterwhich counts the number of countries 
	beginning with a letter or letters. It should take a String and the countryArrayas a parameters and return an int
A public method called printMenu which prints the menu to user and takes no parameter and returns nothing.

getNumberOfCountriesBeginngWithLetter should output a sentence like "The number of countries beginning with Sp is 5"

 */
public class CountryOperations {

	public int calculateAverageCountryLength (String[] countries){
		int accumulator = 0;
		for (int i=0; i<countries.length; i++) {
			accumulator += countries[i].length();
		}
		return accumulator/countries.length; 
	}

	public int getNumberOfCountriesBeginngWithLetter (String str, String[] countries) {
		int counter = 0;
		for (int i=0; i < countries.length; i++) {
			if (countries[i].toLowerCase().startsWith(str.toLowerCase())) {
				counter ++;
			}
		}
		return counter;
	}

	public void printMenu(){
		System.out.println("Please select an option:");
		System.out.println("1. Calculate the average country length");
		System.out.println("2. Find the number of countries beginning with a letter sequence.");
		System.out.println("3. Exit.");
	}
}