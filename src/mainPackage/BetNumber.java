package mainPackage;
import java.util.*;

public class BetNumber {

	public static void Number(){
		
		int RoutletteNumber; // Random number holder
		int NumberBet = -1;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What number do you want to bet");
		
// loop for user error
		do {
			try {
				NumberBet = userInput.nextInt();
				
				if (NumberBet < 0 || NumberBet > 36) {
					System.out.println("Invaid number, please try again!");
				}
			}
			catch (Exception e) {
				System.out.println("Invaid number, please try again!");
				userInput.next();
			}
		} while (NumberBet < 0 || NumberBet > 36);
		
// Generate Random Number 		
		RoutletteNumber = (int) Math.round(Math.random() * 36);
		
// Print The Random Number
		System.out.println("The number is " +RoutletteNumber);
		
// End Result		
		if (RoutletteNumber == NumberBet) {
			FinalResult.Winner();
		}
		else {
			FinalResult.Loser();
		}
		
		userInput.close();
	}
}
