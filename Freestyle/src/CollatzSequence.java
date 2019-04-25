
import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) {
		int n = 0;
		
		Scanner keys = new Scanner(System.in);
		
		System.out.print("Enter a Starting number: ");
		n = keys.nextInt();
		System.out.print(n);
		
		int count = 1;
		
		int max = n;
		
		if (n > 0) {
			while (n != 1) {
				
				if (n%2 == 0) {
					n = n/2;
					System.out.print("	" + n);
					count++;
				}
				
				if (n%2 == 1 && n != 1) {
					n = 3 * n + 1;
					System.out.print("	" + n);
					count++;
				}
				
				if (n > max) {
					max = n;
				}
				
			}
			System.out.println();
			System.out.println("The program terminated after " + count + " steps. " + "The highest number was " + max);
		} else {
			System.out.println(" is an Invalid Number ");
		}
		
	}

}
