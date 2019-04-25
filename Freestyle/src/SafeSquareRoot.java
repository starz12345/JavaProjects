import java.util.Scanner;

public class SafeSquareRoot {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		System.out.println("SQUARE ROOT! ");
		
		int number;
		System.out.println("Enter a number: ");
		do {
			number = (int) keys.nextDouble();
			if (number < 0) System.out.println("You can't take the square root of a negative number, silly.\n" + "Try again:");
		} while(number < 0);
		
		double sqRt = Math.sqrt(number);
		
		System.out.println("The square root of "+ number + " is " + sqRt);

	}

}
