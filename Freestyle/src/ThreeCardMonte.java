import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner keys = new Scanner(System.in);
		
		int guessedNumber = 1 + ran.nextInt(3);
		int guess = 0;
		String art = "";
		String art3 = "	##  ##  AA\n" + 
				"	##  ##  AA\n" + 
				"	1   2   3";
		String art1 = "	AA  ##  ##\n" + 
				"	AA  ##  ##\n" + 
				"	1   2   3";
		String art2 = "	##  AA  ##\n" + 
				"	##  AA  ##\n" + 
				"	1   2   3";
		
		
		
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" + 
				"He glances at you out of the corner of his eye and starts shuffling.\n" + 
				"He lays down three cards.");
		System.out.println();
		
		System.out.println("Which one is the ace?");
		System.out.println("	##  ##  ##\n" + 
		"	##  ##  ##\n" + 
		"	1   2   3");
		
		guess = keys.nextInt();
		
		if (guess != guessedNumber) {
			System.out.println("Ha! Fast Eddie wins again! The ace was card number " + guessedNumber);
			
		} else {
			System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
		} 
		
		if (guessedNumber == 3) art = art3;
		if (guessedNumber == 2) art = art2;
		if (guessedNumber == 1) art = art1;
			
		System.out.println(art);
		
		

	}

}
