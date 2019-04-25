import java.util.Scanner;
public class AskingQuestions1 {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		int  age;
		int heightFt;
		int heightIn;
		int weight;
		
		System.out.print( "How old are you? " );
		age = keys.nextInt();
		
		System.out.println( " " );

		System.out.print( "How many feet tall are you? " );
		heightFt = keys.nextInt();
		
		System.out.println( " " );
		
		System.out.print( "And how many Inches? " );
		heightIn = keys.nextInt();
		
		System.out.println( " " );

		System.out.print( "How much do you weigh? " );
		weight = keys.nextInt();
		
		System.out.println( " " );

		System.out.println( "So, you're " + age + " years old, " + heightFt + "'" + heightIn + "\"" + " tall and " + weight + " heavy." );

	}

}
