import java.util.Scanner;

public class assign3 {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		System.out.print("Enter First Name: ");
		String firstName = keys.nextLine();
		
		System.out.print("Enter Last Name: ");
		String lastName = keys.nextLine();
		
		keys.close();
		
		computeInitials(firstName, lastName); 

	}
	
	public static void computeInitials(String firstName, String lastName) {
		
		String initials = "";
		initials = initials.valueOf(firstName.charAt(0)) + initials.valueOf(lastName.charAt(0));
		
		System.out.println("Your full name is " + firstName + " " + lastName + ". Your initials are " + initials.toUpperCase() + ".");

	}

}
