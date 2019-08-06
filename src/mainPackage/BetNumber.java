package mainPackage;

public class BetNumber {

	public static void Number(){
		
		FinalResult.PlaceBet();
		
		System.out.println("What number do you want to bet");
		
// loop for user error
		do {
			try {
				Main.NumberBet = Main.userInput.nextInt();
				
				if (Main.NumberBet < 0 || Main.NumberBet > 36) {
					System.out.println("Invaid number, please try again!");
				}
			}
			catch (Exception e) {
				System.out.println("Invaid number, please try again!");
				Main.userInput.next();
			}
		} while (Main.NumberBet < 0 || Main.NumberBet > 36);
		
// Generate Random Number 		
		Main.RoutletteNumber = (int) Math.round(Math.random() * 36);
		
// Print The Random Number
		System.out.println("The number is " +Main.RoutletteNumber);
		
// End Result		
		if (Main.RoutletteNumber == Main.NumberBet) {
			Main.Bank = Main.Bank + (Main.CurrentBet*36);
			FinalResult.Winner();
		}
		else {
			Main.Bank = Main.Bank - (Main.CurrentBet);
			FinalResult.Loser();
		}

	}
}
