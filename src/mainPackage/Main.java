package mainPackage;
import java.util.*;

public class Main {
	
	//Global Variables
	public static int RoutletteNumber; // Random number holder
	public static String RoutletteColor = ""; // Color holder
	public static int RedNum[] = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36}; // Numbers that are red
	public static int BlackNum[] = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};  // Numbers that are black
	public static int PlaceHolder; // just a place holder
	public static String BetRoutletteColor = "";
	public static int NumberBet = -1; // for BetNumber
	public static String ResultOddEven; // just a place holder for BetOddEven
	public static String BettingOddEven; // for BetOddEven
	
	//Global Scanner
	public static final Scanner userInput = new Scanner(System.in);

	//Betting Counter
	public static int Bank = 10000;
	public static int CurrentBet;
	
	public static void main(String args[]) {
	
		int menuCounter = 0;
		int exitCounter = 0;
		
	do {	
		FinalResult.Menu();
		try {
			menuCounter = userInput.nextInt();
		}
		catch (Exception e) {}
		
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
		case 4:
			FinalResult.Bank(); //Show bank statement
			break;
		default:	
			System.out.println("You enter an invalid entry");
			System.out.println("Restart the program!");
			exitCounter = 1;
			break;	
		}
	} while (exitCounter == 0);	
	
	userInput.close();	
	}
}
