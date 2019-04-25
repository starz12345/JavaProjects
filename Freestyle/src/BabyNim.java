import java.util.Scanner;

public class BabyNim {

	public static void main(String[] args) {
		
		Scanner keys = new Scanner(System.in);
		
		int a = 5, b = 3, c = 3, rem = 0;
		
		System.out.println("A: " + a + "	B: " + b + "	C: " + c);
		System.out.println("");
		//String pile = keys.nextLine();
		
		do {
			System.out.print("Choose A Pile: ");
			String pile = keys.nextLine();
			System.out.print("How many to remove from pile " + pile + ":");
			rem = keys.nextInt();
			keys.nextLine();
			System.out.println("");
			
			if (pile.contentEquals("A")) {
				a = a - rem;
			} else if (pile.contentEquals("B")) {
				b = b - rem;
			} else if (pile.contentEquals("C")) {
				c = c - rem;
			} else {
				System.out.println("Invalid Pile");
			}
			
			System.out.println("A: " + a + "	B: " + b + "	C: " + c);
			System.out.println("");
	
				
		}while(a > 0 || b > 0 || c > 0);
		
		System.out.println("All piles are empty. Good job!");

	}

}
