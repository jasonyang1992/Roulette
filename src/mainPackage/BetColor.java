package mainPackage;
import java.util.*;

public class BetColor {

	public static void Color(){

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Pick your color. Red or Black.");
		
// User Input for color. loop for user error		
		do {
			Main.BetRoutletteColor = userInput.next() .toUpperCase();
			
			if (!Main.BetRoutletteColor.equals("BLACK") && !Main.BetRoutletteColor.equals("RED")){
				System.out.println("Invalid Entry, Please try again.");
			}
		} while (!Main.BetRoutletteColor.equals("BLACK") && !Main.BetRoutletteColor.equals("RED"));
		
// Random Number 		
		Main.RoutletteNumber = (int) Math.round(Math.random() * 36);
// Place holder to validate color array	
		Main.PlaceHolder = Main.RoutletteNumber;
		
// Determine if it is red		
		for (int iCounter = 0; iCounter < 18; iCounter++) {
			Main.PlaceHolder = Main.RedNum[iCounter];
			if(Main.PlaceHolder == Main.RoutletteNumber) {
				Main.RoutletteColor = "RED";	
			}
		}
				
// Determine if it black		
		for (int iCounter = 0; iCounter < 18; iCounter++) {
			Main.PlaceHolder = Main.BlackNum[iCounter];
			if(Main.PlaceHolder == Main.RoutletteNumber) {
				Main.RoutletteColor = "BLACK";
			}
		}	
		
		
		if (Main.BetRoutletteColor.equals(Main.RoutletteColor)) {
			FinalResult.Winner(); // Win
		}
		else {
			FinalResult.Loser(); // Lose
		}
	
	userInput.close();
	}
	
}
