
public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello!");
		
		int number;// define a variable
		int a; // defined a variable
		number = 5; //initialised, assigned the value to variable
		System.out.println(number);
		a = number;// assigned the value of variable number to var a
		System.out.println(a);
		a = 7; //reassigned the value to var
		System.out.println(a);
		a = 55 + 12 + number;
		System.out.println(a);
		double d = 5.6;
		System.out.println(d);
		d = 7;
		System.out.println(d);
		char symbol = 'A';
		System.out.println(symbol);
		System.out.println('&');
		String name = "Victor";
		System.out.println("Hello, " + name + "!");
		System.out.println("You are " + number * 5 + "years old.");
		int remainder = 5%2;
		System.out.println("remainder " + remainder);
		System.out.println("remainder " + 6%3);
		System.out.println("remainder " + 10%3);
		number = 0;
		if ( number > 0) {
			System.out.println("This is a positive number");
		} else if (number < 0){
			System.out.println("This is a negative number");
		} else {
			System.out.println("Zero!");
		}
		
		
		
		int value1, value2;
		value1 = 901;
		value2 = 15;
		// check if equal or not
		if (value1 == value2) {
			System.out.println("The values are equal");
		} else {
			System.out.println("The values are not equal");
		}
		if (value1%2 == 0) {
			System.out.println(value1 + " is an even number");
		} else {
			System.out.println(value1 + " is an odd number");
		}
		
	}
	
	
	

}
