import java.util.Scanner;

public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
		
		System.out.print("How many times? ");
		int time = keyboard.nextInt();

		int n = 0;
		while ( n < time )
		{
			n++;
			System.out.println( (n*10) + ". " + message );
			
		}

	}
}