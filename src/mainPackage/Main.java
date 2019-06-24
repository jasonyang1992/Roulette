package mainPackage;
import java.util.*;

public class Main {

	public static void main(String args[]) {
/*		
		int RoutletteNumber; // Random number holder
		String RoutletteColor = ""; // Color holder
		int RedNum[] = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36}; // Numbers that are red
		int BlackNum[] = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};  // Numbers that are black
		int PlaceHolder; // just a place holder
		int NumberBet = 0;
*/		
		int menuCounter;
		
		System.out.println("Welcome to Roulette");

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("--------Menu-------");
		System.out.println("1 - Bet on a number");
		System.out.println("2 - Bet on a color");
		System.out.println("3 - Bet Even or Odd");
		menuCounter = userInput.nextInt();
		
		switch (menuCounter) {
// Number Bet
		case 1:
			BetNumber.Number();
			break;
// Color Bet			
		case 2:
			BetColor.Color();
			break;
// Odd | Even
		case 3:
			BetOddEven.OddEven();
			break;
		default:	
			System.out.println("You enter an invalid entry");
			System.out.println("Restart the program!");
			break;
		}
		
		userInput.close();
	}
}
