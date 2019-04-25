import java.util.Scanner;

public class MoreUserInputOfData {

	public static void main(String[] args) {
		
		Scanner keys = new Scanner(System.in);
		String Fname;
		String Lname;
		int grade;
		int id;
		String login;
		double gpa;
		
		System.out.println("Please enter the following information so I can sell it for a profit!");
		
		System.out.println( " " );
		
		System.out.print("First name: ");
		Fname = keys.nextLine();
		
		System.out.println( " " );
		
		System.out.print("Last name: ");
		Lname = keys.nextLine();
		
		System.out.println( " " );
		
		System.out.print("Grade (9 - 12) : ");
		grade = keys.nextInt();
		
		System.out.println( " " );
		
		System.out.print("Student ID: ");
		id = keys.nextInt();
		
		System.out.println( " " );
		
		
		System.out.print("Login: ");
		login = keys.nextLine();
		
		System.out.print("GPA (0.0-4.0): ");
		gpa = keys.nextDouble();
		
		System.out.println( " " );
		
		System.out.println("Your information: \n" 
				+ "	Login: " + login + "\n"
				+ "	ID: " + id + "\n"
				+ "	Name: " + Lname + ", " + Fname + "\n"
				+ "	GPA: " + gpa + "\n"
				+ "	Grade: " + grade);
		
		
		

	}

}
