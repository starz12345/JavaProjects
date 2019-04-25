import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner keys = new Scanner(System.in);
		
		int guessedNumber = 1 + ran.nextInt(10);
		
		//System.out.println(guessedNumber);
		
		int guess = 0;
		System.out.println("I'm thinking of a number from 1 to 10.");
		do {
			
			System.out.println("Your guess: ");
			guess = keys.nextInt();
			
			if (guess != guessedNumber) {
				System.out.println("Sorry, but I was really thinking of " + guessedNumber);
			} else {
				System.out.println("You got it!!");
			}
			
		} while(guess != guessedNumber);
		
		

	}

}
