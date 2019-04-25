import java.util.Scanner;

public class lecture {

	public static void main(String[] args) {
		System.out.println("Lecture 02");
		
		double km = 5;
		double miles;
		
		miles = km * 0.621;
		
		System.out.println(km + " km = " +  miles + " miles");
		
		String input;
		Scanner sc = new Scanner (System.in);
		/**
		System.out.print("What is your name? ");
		input = sc.nextLine();
		System.out.println("Hello, " + input + "!");
		
		**/
		
		System.out.println("Input kilometers to convert to miles ");
		input = sc.nextLine();
		km = Double.parseDouble(input);
		
		miles = km * 0.621;
		System.out.println(km + " km = " +  miles + " miles");
		

	}

}
