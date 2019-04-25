import java.util.Scanner;

public class DumbCalculator {

	public static void main(String[] args) {
		
		Scanner keys = new Scanner(System.in);
		double a,b,c,d;
		
		System.out.print("Input your favorite numbers");
		
		System.out.print("What is your first number?");
		a = keys.nextDouble();
		
		System.out.print("What is your second number?");
		b = keys.nextDouble();
		
		System.out.print("What is your third number?");
		c = keys.nextDouble();
		
		d = (a + b + c ) / 2;
		
		System.out.print(" ( " + a + " + " + b  + " + " + c + " ) " + " / 2 is... " + d );
		
		System.out.print(" ");
		
		
				

	}

}
