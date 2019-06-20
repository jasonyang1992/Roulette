package mainPackage;
import java.util.*;

public class Main {

	public static void main(String args[]) {
		
		int RoutletteNumber; // Random number holder
		String RoutletteColor = ""; // Color holder
		int RedNum[] = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36}; // Numbers that are red
		int BlackNum[] = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};  // Numbers that are black
		int PlaceHolder; // just a place holder
		int NumberBet = 0;
		int menuCounter;
		
		System.out.println("Welcome to Roulette");

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Menu");
		System.out.println("1 - Bet on a number");
		menuCounter = userInput.nextInt();
		
		switch (menuCounter) {
// Number Bet
		case 1:
			System.out.println("What number do you want to bet");
				do {
					NumberBet = userInput.nextInt();
					
					if (NumberBet > 37) {
						System.out.println("Invaid number, please try again!");
					}
					
				} while (NumberBet > 37);
			break;	
		default:	
			System.out.println("You enter an invalid entry");
			break;
		}
// Random Number 		
		RoutletteNumber = (int) Math.round(Math.random() * 36);
		
// Determine if it is red		
		for (int iCounter = 0; iCounter < 18; iCounter++) {
			PlaceHolder = RedNum[iCounter];
			if(PlaceHolder == RoutletteNumber) {
				RoutletteColor = "Red";	
			}
		}
		
// Determine if it black		
		for (int iCounter = 0; iCounter < 18; iCounter++) {
			PlaceHolder = BlackNum[iCounter];
			if(PlaceHolder == RoutletteNumber) {
				RoutletteColor = "Black";
			}
		}
		
// Result		
		System.out.println("The number is " + RoutletteNumber + " " + RoutletteColor);
		
		if (NumberBet == RoutletteNumber) {
			FinalResult.Winner();
		}
		else {
			FinalResult.Loser();
		}
		
		userInput.close();
	}
}
