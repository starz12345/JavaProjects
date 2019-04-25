import java.util.Scanner;

public class GenderGame {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		String firstName, lastName, gender, married = "";
		
		int age;
		
		
		System.out.print("What is your gender (M or F): ");
		gender = keys.nextLine();
		
		System.out.print("First name: ");
		firstName = keys.nextLine();
		
		System.out.print("Last name: ");
		lastName = keys.nextLine();
		
		System.out.print("Age: ");
		age = keys.nextInt();
		System.out.println();
		
		if (gender.equals("F") && age >= 20) {
			keys.nextLine();
			System.out.print("Are you married, Kim (y or n)? ");
			married = keys.nextLine();
			
			if (married.contentEquals("y")) {
				System.out.println("Then I shall call you Mrs. " + lastName);
			} else if (married.contentEquals("n")) {
				System.out.println("Then I shall call you Ms." + lastName);
			}
		} 
		
		if (age < 20) System.out.println("Then I shall call you " + firstName + " " + lastName);
		
		if (gender.contentEquals("M") && age >= 20) System.out.println("Then I shall call you Mr. " + lastName);
		
		

	}

}
