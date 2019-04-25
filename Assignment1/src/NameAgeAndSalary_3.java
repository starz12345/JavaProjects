import java.util.Scanner;
public class NameAgeAndSalary_3 {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		String name;
		int age;
		double salary;
		
		System.out.print( "Hello.  What is your name? " );
		name = keys.nextLine();
		System.out.println(name);
		
		System.out.print( "Hi, " + name + " How old are you?" );
		age = keys.nextInt();
		System.out.println(age);
		
		System.out.print( "So you're " + age + ", eh? That's not old at all! How much do you make, " + name + "?");
		salary = keys.nextDouble();
		System.out.println(salary);
		
		System.out.println( salary + "!  I hope that's per hour and not per year! LOL!");
		
		

	}

}
