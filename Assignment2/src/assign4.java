import java.util.Scanner;

public class assign4 {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		double c, f;
		
		System.out.print("What is the temperature in Centigrade? ");
		c = keys.nextDouble();
		
		f = (c * 9/5) + 32;
		
		System.out.println(f + " degrees Fahrenheit");
		
		

	}

}
