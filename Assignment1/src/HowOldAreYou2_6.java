import java.util.Scanner;

public class HowOldAreYou2_6 {

	public static void main(String[] args) {
		
		Scanner keys = new Scanner(System.in);
		String name;
		int age;
		String a = "You can't drive";
		String b = "You can drive but not vote";
		String c = "You can vote but not rent a car";
		String d = "You can do pretty much anything";
		
		System.out.print( "Hello.  What is your name? (Sorry, I keep forgetting.) " );
		name = keys.nextLine();
		
		System.out.println( " " );
		
		System.out.print( "Okay, " + name + " How old are you?" );
		age = keys.nextInt();
		
		System.out.println( " " );

		if ( age < 16 ) {
			System.out.println(a + ", " + name + ".");
		} else if ( 18 > age && age >= 16) {
			System.out.println(b + ", " + name + ".");
		} else if( 25 > age && age >= 18 ) {
			System.out.println(c + ", " + name + ".");
		} else {
			System.out.println(d + ", " + name + ".");
		}

	}

}
