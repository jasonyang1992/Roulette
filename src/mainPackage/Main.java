package mainPackage;

public class Main {

	public static void main(String args[]) {
		
		int RoutletteNumber; // Random number holder
		String RoutletteColor; // Color holder
		int RedNum[] = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36}; // Numbers that are red
		int BlackNum[] = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};  // Numbers that are black
		int PlaceHolder; // just a place holder
		
		System.out.println("Welcome to Roulette");
// Random Number 		
		RoutletteNumber = (int) Math.round(Math.random() * 36);
		
		System.out.print(RoutletteNumber);
// Determine if it is red		
		for (int iCounter = 0; iCounter < 18; iCounter++) {
			PlaceHolder = RedNum[iCounter];
			if(PlaceHolder == RoutletteNumber) {
				RoutletteColor = " Red";
				System.out.println(RoutletteColor);
			}
		}
// Determine if it black		
		for (int iCounter = 0; iCounter < 18; iCounter++) {
			PlaceHolder = BlackNum[iCounter];
			if(PlaceHolder == RoutletteNumber) {
				RoutletteColor = " Black";
				System.out.println(RoutletteColor);
			}
		}
		
		
	}
}
