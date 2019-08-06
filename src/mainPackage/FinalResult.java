package mainPackage;

public class FinalResult {

//Menu
	public static void Menu() {
		System.out.println("Welcome to Roulette");
		System.out.println("--------Menu-------");
		System.out.println("1 - Bet on a number");
		System.out.println("2 - Bet on a color");
		System.out.println("3 - Bet Even or Odd");
		System.out.println("4 - Check Bank Statement");
	}
// Execute Win	
	public static void Winner() {
		System.out.println("You win!");
	}
// Execute lost	
	public static void Loser() {
		System.out.println("You lose :(");
	}
// Bank Statement
	public static void Bank() {
		System.out.println("Current bank dollars is " +Main.Bank);
	}
// Place bet
	public static void PlaceBet() {
		System.out.println("Place your Bet");
		
		for (int iCounter = 0; iCounter < 1; iCounter++) {
			try {
				do {
					Main.CurrentBet = Main.userInput.nextInt();
					if (Main.CurrentBet > Main.Bank) {
						System.out.println("You don't have enough money. Current money in the bank is " +Main.Bank);
					}
				} while (Main.CurrentBet > Main.Bank);
			}
			catch (Exception e) {
				System.out.println("Invalid Entry please try again");
				Main.userInput.next();
				iCounter--;
			}
		}
	}
}
