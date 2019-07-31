package mainPackage;
import java.util.*;

public class BetNumber {

	public static void Number(){
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What number do you want to bet");
		
// loop for user error
		do {
			try {
				Main.NumberBet = userInput.nextInt();
				
				if (Main.NumberBet < 0 || Main.NumberBet > 36) {
					System.out.println("Invaid number, please try again!");
				}
			}
			catch (Exception e) {
				System.out.println("Invaid number, please try again!");
				userInput.next();
			}
		} while (Main.NumberBet < 0 || Main.NumberBet > 36);
		
// Generate Random Number 		
		Main.RoutletteNumber = (int) Math.round(Math.random() * 36);
		
// Print The Random Number
		System.out.println("The number is " +Main.RoutletteNumber);
		
// End Result		
		if (Main.RoutletteNumber == Main.NumberBet) {
			FinalResult.Winner();
		}
		else {
			FinalResult.Loser();
		}
		userInput.close();
	}
}
