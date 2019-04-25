import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int numberToGuess = ran.nextInt(1000);
		
		System.out.println(numberToGuess);
		
		int tries = 0;
		int maxTries = 4;
		
		int guess = 0;
		
		Scanner keys = new Scanner(System.in);	
		
		System.out.println("Make a Guess from 1 - 1000");
		
		
		
		int count = 0;
		do {
			
			guess = keys.nextInt();
			tries++;
			count++;
			if (guess > numberToGuess) {
				System.out.println("Guess too high");
			} else if (guess < numberToGuess) {
				System.out.println("Guess too low");
			} else {
				System.out.println("Correct");
			}
		}while (guess != numberToGuess && tries < maxTries);
		
		if (guess == numberToGuess) {
			System.out.println("Your Guess is correct");
		} else if (tries >= maxTries) {
			System.out.println("YOU HAVE RUN OUT OF TRIES.");
		}
		System.out.println("You made a total of " + count + " guess(es), The correct number is " +  numberToGuess);		

	}

}
/**
System.out.println("Make a Guess between 1 and 1000");

guess = keys.nextInt();

if (guess > numberToGuess) {
	System.out.println("Number too high");
} else if (guess < numberToGuess) {
	System.out.println("Number too low");
} else {
	System.out.println("Correct");
}



while (guess != numberToGuess) {
	System.out.println("Make another Guess from 1 - 1000");
	guess = keys.nextInt();
	count++;
	if (guess > numberToGuess) {
		System.out.println("Number too high");
	} else if (guess < numberToGuess) {
		System.out.println("Number too low");
	} else {
		System.out.println("Correct");
	}
}
**/