import java.util.Scanner;

public class lecture2part2 {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		Double length, width, area, perimeter;
		
		
		
		System.out.println("What is the length of the rectangle? ");
		length = keys.nextDouble();
		
		System.out.println("What is the width of the rectangle? ");
		width = keys.nextDouble();
		
		area = length * width;
		
		perimeter = (length + width) * 2;
		
		System.out.println("The area of the rectangle is " + area + " and the perimeter is " + perimeter);
		
		
				
				
	}

}
