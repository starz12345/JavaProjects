import java.util.Scanner;

public class LittleQuiz_7 {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in); //add Scanner variable
		int ans; //integer to store answers
		int score = 0; //integer to store the scores
		
		System.out.println( "Are you ready for a quiz?" );
		
		
		
		System.out.println( "---------------------- " );
		
		System.out.println( "Okay, here it comes!" );
		
		System.out.println( " " );
		
		//first question
		System.out.println( "Q1) What is the capital of Alaska?\n" + 
				"	1) Melbourne\n" + 
				"	2) Anchorage\n" + 
				"	3) Juneau" );
		ans = keys.nextInt();
		
		System.out.println();
		if ( ans == 3 ) {
			System.out.println( "That's right!" );
			score++; // add 1 to score for correct answer
		} else {
			System.out.println( "That's wrong! The right answer is Juneau" );
		}
		
		System.out.println( " " );
		
		//second question
		System.out.println( "Q2) Can you store the value \"cat\" in a variable of type int?\n" + 
				"	1) yes\n" + 
				"	2) no" );
		ans = keys.nextInt();
		
		System.out.println();
		if ( ans == 2 ) {
			System.out.println( "That's right!" );
			score++; // add 1 to score for correct answer
		} else {
			System.out.println( "Sorry, \"cat\" is a string. ints can only store numbers." );
		}
		
		System.out.println( " " );
		
		//third question
		System.out.println( "Q3) What is the result of 9+6/3?\n" + 
				"	1) 5 \n" + 
				"	2) 11 \n" + 
				"	3) 15/3" );
		ans = keys.nextInt();
		System.out.println();
		if ( ans == 2 ) {
			System.out.println( "That's correct!" );
			score++; // add 1 to score for correct answer
		} else {
			System.out.println( "That's wrong! The right answer is 11" );
		}
		
		System.out.print("Overall, you got " + score + " out of 3 correct.\n" + 
				"Thanks for playing!");
	}
}

