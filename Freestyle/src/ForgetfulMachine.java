import java.util.Scanner;

public class ForgetfulMachine {

	public static void main(String[] args) {
		
		Scanner keys = new Scanner(System.in);
		
		System.out.println("Give me a word!");
		keys.nextLine();
		
		System.out.println("Give me a second word!");
		keys.nextLine();
		
		System.out.println("Great, now your favorite number?");
		keys.nextLine();
		
		System.out.println("And your second-favorite number...");
		keys.nextLine();
		
		
		System.out.println("Whew!  Wasn't that fun?");
		

	}

}
