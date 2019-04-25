import java.util.Scanner;

public class AddingValuesInALoop {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		int numbers = 0, sum = 0;
		
		
		System.out.println("I will add up the numbers you give me.");
		System.out.print("number: ");
		numbers = keys.nextInt();
		sum = sum + numbers;
		
		while (numbers != 0) {
			
			System.out.print("number: ");
			numbers = keys.nextInt();
			sum = sum + numbers;
			
			System.out.println("The total so far is " + sum);
		};
		
		System.out.println("The total is " + sum);
	}

}
