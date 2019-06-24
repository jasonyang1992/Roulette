package mainPackage;
import java.util.*;

public class BetOddEven {

	public static void OddEven() {
		
		int RoutletteNumber; // Random number holder
		String ResultOddEven; // just a place holder
		String BetOddEven;
	
		System.out.println("Bet Odd or Even");
		
		Scanner userInput = new Scanner(System.in);
// Loop for user input and user error		
		do {
			BetOddEven = userInput.next() .toUpperCase();
			
			if (!BetOddEven.equals("ODD") && !BetOddEven.equals("EVEN")) {
				System.out.println("Invalid Entry. Odd or Even");
			}
		} while (!BetOddEven.equals("ODD") && !BetOddEven.equals("EVEN"));
		
// Generate Random Number 		
		RoutletteNumber = (int) Math.round(Math.random() * 36);
		System.out.println(RoutletteNumber);
		
// Determine if it is odd or even		
		if (RoutletteNumber % 2 == 0) {
			ResultOddEven = "EVEN";
			System.out.println("It is even");
		}
		else {
			ResultOddEven ="ODD";
			System.out.println("It is Odd");
		}
// Result		
		if (ResultOddEven.equals(BetOddEven)) {
			FinalResult.Winner();
		}
		else{
			FinalResult.Loser();
		}
		
		userInput.close();
	}
}
