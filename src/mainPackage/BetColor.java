package mainPackage;
import java.util.*;

public class BetColor {

	public static void Color(){
		
		int RoutletteNumber; // Random number holder
		String RoutletteColor = ""; // Color holder
		int RedNum[] = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36}; // Numbers that are red
		int BlackNum[] = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};  // Numbers that are black
		int PlaceHolder; // just a place holder
		String BetRoutletteColor = "";

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Pick your color. Red or Black.");
		
// User Input for color. loop for user error		
		do {
			BetRoutletteColor = userInput.next() .toUpperCase();
			
			if (!BetRoutletteColor.equals("BLACK") && !BetRoutletteColor.equals("RED")){
				System.out.println("Invalid Entry, Please try again.");
			}
		} while (!BetRoutletteColor.equals("BLACK") && !BetRoutletteColor.equals("RED"));
		
// Random Number 		
		RoutletteNumber = (int) Math.round(Math.random() * 36);
// Place holder to validate color array	
		PlaceHolder = RoutletteNumber;
		
// Determine if it is red		
		for (int iCounter = 0; iCounter < 18; iCounter++) {
			PlaceHolder = RedNum[iCounter];
			if(PlaceHolder == RoutletteNumber) {
				RoutletteColor = "RED";	
			}
		}
				
// Determine if it black		
		for (int iCounter = 0; iCounter < 18; iCounter++) {
			PlaceHolder = BlackNum[iCounter];
			if(PlaceHolder == RoutletteNumber) {
				RoutletteColor = "BLACK";
			}
		}	
		
		
		if (BetRoutletteColor.equals(RoutletteColor)) {
			FinalResult.Winner(); // Win
		}
		else {
			FinalResult.Loser(); // Lose
		}
	
	userInput.close();
	}
	
}
