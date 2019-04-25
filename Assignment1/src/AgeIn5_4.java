import java.util.Scanner;
public class AgeIn5_4 {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print( "Hello.  What is your name? " );
		name = keys.nextLine();
		
		System.out.println( " " );
		
		System.out.print( "Hi, " + name + " How old are you?" );
		age = keys.nextInt();
		
		System.out.println( " " );
		
		System.out.println("Did you know that in five years you will be " + (age + 5) + " years old?" + " And five years ago you were " + (age - 5) + "! Imagine that!");
		
		
	}

}
