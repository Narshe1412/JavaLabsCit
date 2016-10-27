import java.util.Random;



public class LotteryGame {
	
	private final int MAX_NUMBER = 10;
	private final int NUMBER_OF_PICKS = 10;
	private final int TICKET_PRICE = 1;
	
	//PRIZES
	private final int 
			FIRST_PRIZE_MATCHES = 3,
			SECOND_PRIZE_MATCHES = 2,
			THIRD_PRIZE_MATCHES = 1,
			
			FIRST_PRIZE = 10,
			SECOND_PRIZE = 5,
			THIRD_PRIZE = 1,
			CONSOLATION_PRIZE = 0;

	
	Random random = new Random();
	
	public int playTheGame(int money){
		int[] playerPicks = new int[NUMBER_OF_PICKS],
				winningTicket = new int[NUMBER_OF_PICKS];
		int matches = 0;
		
		money-= TICKET_PRICE;
		
		playerPicks = generatePicks();
		winningTicket = generatePicks();
		matches = checkNumberOfMatches(playerPicks, winningTicket);
		
		printResult(matches, playerPicks, winningTicket);
		money += givePrizes(matches);
		
		return money;
	}
	
	
	private int[] generatePicks() { //pick roller for tickets and lottery
		int ticket[] = new int[NUMBER_OF_PICKS];
		for (int i = 0; i < NUMBER_OF_PICKS; i++) {
			ticket[i] = random.nextInt(MAX_NUMBER+1); //from 0 to MAX NUMBER included
		}
		return ticket;
	}
	
	
	private int checkNumberOfMatches(int userTicket[], int winningTicket[]) { 
		int noMatches = 0;
		int[] auxArray = winningTicket.clone(); //copy so the array can be reused at a later time
		
		for (int i=0; i<userTicket.length; i++) {
			for (int j=0; j<auxArray.length; j++) {
				if (userTicket[i] == auxArray[j]) {
					noMatches++;
					auxArray[j]=-1;
					break;
				}
			}
		}
		return noMatches;
	}
	
	private int givePrizes(int matches) {
		switch (matches) {
		case FIRST_PRIZE_MATCHES:
			return FIRST_PRIZE;	
		case SECOND_PRIZE_MATCHES:
			return SECOND_PRIZE;
		case THIRD_PRIZE_MATCHES:
			return THIRD_PRIZE;
		default:
			return CONSOLATION_PRIZE; //in case it's needed for future implementations
		}
	}
	
	private String printTicket(int ticket[], boolean isPlayer) {
		String printed = "";
		printed = isPlayer? "Your ticket numbers are: ": "The winning ticket is: ";
		
		for (int i=0; i < ticket.length; i++){
			printed = printed + ticket[i] + " ";
		}
		return printed;
	}
	
	private void printResult(int matches, int[] playerPicks, int[] winningTicket){
		System.out.println(printTicket(playerPicks, true));
		System.out.println(printTicket(winningTicket, false));
		if (matches > 0) {
			System.out.println("Congratulations!! You've guessed " + matches + " number(s)!");
			System.out.println("You've won a total of " + givePrizes(matches) + "€.");
		} else {
			System.out.println("I'm deeply sorry, you didn't got any match. Better luck next time.");
		}
		
	}
	
	public void printMoney(int totalMoney) {
		System.out.println(totalMoney >0? "Your current balance is " + totalMoney + "€." : "You ran out of money and can't keep playing." );
	}
}
