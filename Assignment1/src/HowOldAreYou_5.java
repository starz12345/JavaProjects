import java.util.Scanner;

public class HowOldAreYou_5 {

	public static void main(String[] args) {

		Scanner keys = new Scanner(System.in);
		String name;
		int age;
		String a = "You can't drive";
		String b = "You can't vote";
		String c = "You can't rent a car";
		String d = "You can do anything that's legal";
		
		System.out.print( "Hello.  What is your name? " );
		name = keys.nextLine();
		
		System.out.println( " " );
		
		System.out.print( "Okay, " + name + " How old are you? " );
		age = keys.nextInt();
		
		if(age<16) System.out.println("You can't drive, "+name+".");
		if(age<18) System.out.println("You can't vote, "+name+".");
		if(age<25) System.out.println("You can't rent a car, "+name+".");
		if(age>=25) System.out.println("You can do anything that's legal, "+name+".");
}
}