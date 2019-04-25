import java.util.Scanner;

public class RightTriangleChecker {

	public static void main(String[] args) {
		
		Scanner keys = new Scanner(System.in);
		int sideA, sideB, sideC;
		
		System.out.print("Enter three integers:\n");
		
		System.out.print("Side 1: ");
		sideA = keys.nextInt();
		
		do {
			System.out.print("Side 2: ");
			sideB = keys.nextInt();
			
			if (sideA > sideB) System.out.println(sideB + " is smaller than " + sideA + ". Try Again!");			
		} while(sideA > sideB);
		
		do {
			System.out.print("Side 3: ");
			sideC = keys.nextInt();
			
			if (sideC < sideB) System.out.println(sideC + " is smaller than " + sideB + ". Try Again!");
		}while (sideC < sideB);
		
		System.out.println("Your three sides are " + sideA + " " + sideB + " " + sideC);
		
		int total = sideA * sideA + sideB * sideB;
		
		double rightTriangle; 
		rightTriangle = Math.sqrt(total);
		
		if (rightTriangle != sideC) {
			System.out.println("NO!  These sides do not make a right triangle!");
		} else {
			System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
		}

	}

}
