import java.util.Scanner;

public class MainProgram {
	
	public static void main (String[] args) {
			/*Your program should have two classes MainProgram and CountryOperations

MainProgramshould contain the countryArray and a main method (like last week)

It should do the following :

Display a menu to the user asking if they want to :
Calculate the average country length
Find the number of countries beginning with a letter sequence.
Exit.
A Scanner should be used to capture the users input when choosing an option and also when they are asked for a letter sequence in Option 2
**A while loop should keep running allowing them to keep choosing 1 or 2 as they wish. Once they enter 3 the program should exit.
**It should create an instance of CountryOperations in main and call its methods as appropriate.
**If the user enters an invalid option (i.e. Not 1,2 or 3) they should get this message "You have entered an invalid option."
			*/	

		
		String[] countryNames = {"Afghanistan","Albania","Algeria","Andorra","Angola","Antigua and Barbuda","Argentina","Armenia","Aruba","Australia","Austria","Azerbaijan", "The Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin","Bhutan","Bolivia","Bosnia and Herzegovina","Botswana","Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burma", "Burundi", "Cambodia","Cameroon","Canada", "Cabo Verde","Central African Republic","Chad","Chile","China","Colombia","Comoros","Democratic Republic of the Congo ", "Republic of the Congo","Costa Rica","Cote d'Ivoire","Croatia","Cuba","Curacao","Cyprus","Czech Republic", "Denmark","Djibouti","Dominica", "Dominican Republic", "East Timor","Ecuador","Egypt","El Salvador","Equatorial Guinea","Eritrea","Estonia","Ethiopia", "Fiji", "Finland", "France", "Gabon","Gambia, The","Georgia","Germany","Ghana","Greece","Grenada","Guatemala","Guinea","Guinea-Bissau","Guyana", "Haiti","Holy See","Honduras","Hong Kong","Hungary", "Iceland","India","Indonesia","Iran","Iraq","Ireland","Israel","Italy", "Jamaica","Japan","Jordan", "Kazakhstan","Kenya","Kiribati","North Korea","South Korea","Kosovo","Kuwait","Kyrgyzstan", "Laos","Latvia","Lebanon","Lesotho","Liberia","Libya","Liechtenstein","Lithuania","Luxembourg", "Macau","Macedonia","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Marshall Islands","Mauritania","Mauritius","Mexico","Micronesia", "Moldova","Monaco","Mongolia","Montenegro","Morocco","Mozambique", "Namibia","Nauru","Nepal","Netherlands","New Zealand","Nicaragua","Niger","Nigeria","Norway", "Oman", "Pakistan","Palau","Palestinian Territories","Panama","Papua New Guinea","Paraguay","Peru","Philippines","Poland", "Portugal", "Qatar", "Romania","Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia","Saint Vincent and the Grenadines","Samoa","San Marino","Sao Tome and Principe","Saudi Arabia", "Senegal","Serbia","Seychelles","Sierra Leone","Singapore","Sint Maarten","Slovakia","Slovenia","Solomon Islands","Somalia","South Africa", "South Korea","South Sudan","Spain","Sri Lanka","Sudan","Suriname","Swaziland", "Sweden","Switzerland","Syria", "Taiwan","Tajikistan","Tanzania","Thailand","Timor-Leste","Togo","Tonga","Trinidad and Tobago","Tunisia","Turkey","Turkmenistan","Tuvalu", "Uganda","Ukraine","United Arab Emirates","United Kingdom","Uruguay","Uzbekistan", "Vanuatu","Venezuela","Vietnam", "Yemen", "Zambia","Zimbabwe"};
		Scanner keyboard = new Scanner(System.in);
		String answer = "";
		String strToCheck = "";
		CountryOperations countryOps = new CountryOperations();
		
		System.out.println("Welcome to country checker."); //greetings
		
		while (!answer.equals("3")) { // we will enter the loop UNLESS the user does not want
			countryOps.printMenu();
			System.out.println("Please enter (1-3): "); //we make sure the user is asked for the proper command, otherwise = Loop
			answer = keyboard.next();
			
			//
			if (answer.equals("1")) { //Case AverageCountryLength
				System.out.println("The average country length is " + countryOps.calculateAverageCountryLength(countryNames) + ".");
			} else if (answer.equals("2")) { //Case getCountriesBeginningWithLetter
				System.out.println("What String do you want to check?");
				strToCheck = keyboard.next();
				countryOps.getNumberOfCountriesBeginngWithLetter(strToCheck, countryNames);
			} else if (!answer.equals("3")) {
				System.out.println("You have entered an invalid option.");
			}
			System.out.println("");
		}
		System.out.println("Goodbye!");//EoP
	}
}