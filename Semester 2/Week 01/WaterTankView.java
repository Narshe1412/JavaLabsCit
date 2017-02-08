import java.util.Scanner;

public class WaterTankView {

	Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String optionSelected = "";
		
		do {
			System.out.println("1. Add to Tank");
			System.out.println("2. Remove from Tank");
			System.out.println("3. Display Current Volume in Tank");
			System.out.println("0. Exit");
		} while (optionSelected == "" || optionSelected == "0"); 
		
	}
}
