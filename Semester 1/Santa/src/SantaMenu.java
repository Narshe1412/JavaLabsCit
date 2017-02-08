import java.util.Scanner;

/*
		 * Santa should be able to log hours for an elf.
Santa should be able to reset the hours for all elves with one action.
Santa should be able to print out his current wage bill. This should include
The pay due to each elf
The total pay due to all his elves.
Search for an elf by name and print out his name and hours.
Be able to quit the system.

		 * */
public class SantaMenu {


	private Elf[] workforce = new Elf[Elf.NUMBER_OF_ELVES];
	Scanner keyboard = new Scanner(System.in);
	
	public void logHours() {
		String inputname;
		boolean created = false;
		int i = 0;
		System.out.println("Please enter the name of the elf:");
		inputname = keyboard.next();
		
		while (!created && i < workforce.length) {
			if (workforce[i] == null) { //if this elf is new
				workforce[i] = new Elf(); //initialize the array
				workforce[i].setElfName(inputname); // add elf name
				System.out.println("Please enter the hours for " + workforce[i].getElfName() +": ");
				workforce[i].setHoursWorked(keyboard.nextInt());
				created = true;
			} else if (workforce[i].getElfName().equalsIgnoreCase(inputname)) {
				System.out.println("Please enter the hours for " + inputname + ": ");
				workforce[i].setHoursWorked(keyboard.nextInt());
				created = true;
			}
			i++;
		}
		
		if (i == workforce.length) {
			System.out.println("All elves have been entered in the database.");
		}
	}

	public void resetAll() {
		for (int i=0; i < workforce.length; i++) {
			if (!(workforce[i]==null)) {
				workforce[i].setHoursWorked(0);
			}
		}
		System.out.println("All hours have been reset.");
	}

	public void calculateBill() {
		int i = 0;
		while (!(workforce[i] == null)){
			System.out.println("Elf: " + workforce[i].getElfName() + " Salary: " + workforce[i].getSalary());
			i++;
		}
	}

	public void calculateAll() {
		int i = 0,
			totalsalary = 0;
		while (!(workforce[i] == null)) {
			totalsalary += workforce[i].getSalary();
			i++;
		}
		System.out.println("Total salary due: " + totalsalary);
	}

	public void printElfDetails() {
		String inputname;
		int i = 0;
		boolean found = false;
		System.out.println("Please enter the name of the elf you want to print:");
		inputname = keyboard.next();

		while (!(workforce[i] == null) && !found && i<workforce.length) {
			if (workforce[i].getElfName().equalsIgnoreCase(inputname)) {
				System.out.println("Total hours logged for " + workforce[i].getElfName() + ": " + workforce[i].getHoursWorked() + "h.");
				found = true;
			} 
			i++;
			
			if (!found) {
				System.out.println("Elf not found in the database.");
			}
		}
	}
}
