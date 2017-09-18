import java.util.Scanner;

/**
 * 
 */

/**
 * @author Manuel Colorado
 *
 */
public class MainProgram {

	/**
	 * @param args
	 */
	private final static int MONEY_TO_SPEND = 10;
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String menuOption = "";
		int totalPurse = MONEY_TO_SPEND;
		LotteryGame game = new LotteryGame();
		
		System.out.println("Welcome to Lottery Night!");
		System.out.println("Do you want to play? (y/n)");
		game.printMoney(totalPurse);
		
		while (!menuOption.equalsIgnoreCase("n") && totalPurse > 0) 
		{
			menuOption = keyboard.next();
			if (menuOption.equalsIgnoreCase("y")) {
				totalPurse = game.playTheGame(totalPurse);
				
				System.out.println("");
				game.printMoney(totalPurse);
				System.out.println(totalPurse >= 0? "Do you want to play again? (y/n)":""); //only offer replay if you have money
			}
		}
		System.out.println("");
		System.out.println("Thanks for playing. See you next time!");
	}
}
