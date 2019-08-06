package mainPackage;

public class BetOddEven {

	public static void OddEven() {
		
		FinalResult.PlaceBet();
		
		System.out.println("Bet Odd or Even");
		
// Loop for user input and user error		
		do {
			Main.BettingOddEven = Main.userInput.next() .toUpperCase();
			
			if (!Main.BettingOddEven.equals("ODD") && !Main.BettingOddEven.equals("EVEN")) {
				System.out.println("Invalid Entry. Odd or Even");
			}
		} while (!Main.BettingOddEven.equals("ODD") && !Main.BettingOddEven.equals("EVEN"));
		
// Generate Random Number 		
		Main.RoutletteNumber = (int) Math.round(Math.random() * 36);
		System.out.println(Main.RoutletteNumber);
		
// Determine if it is odd or even		
		if (Main.RoutletteNumber % 2 == 0) {
			Main.ResultOddEven = "EVEN";
			System.out.println("It is even");
		}
		else {
			Main.ResultOddEven ="ODD";
			System.out.println("It is Odd");
		}
// Result		
		if (Main.ResultOddEven.equals(Main.BettingOddEven)) {
			Main.Bank = Main.Bank + (Main.CurrentBet);
			FinalResult.Winner();
		}
		else{
			Main.Bank = Main.Bank - (Main.CurrentBet);
			FinalResult.Loser();
		}
		
	}
}
