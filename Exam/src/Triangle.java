import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Triangle {
	public static Scanner keys = new Scanner(System.in);
	public static double sideA, sideB, sideC;
	public static double base, height;
	public static double area;
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter myWriter = new PrintWriter("/Users/victoray/Desktop/java/Exam/VictorAyogu_Exam.txt");
		
		System.out.println("Enter 3 sides of triangle or height and base. pick A or B");
		String choice = keys.nextLine();
		
		if (choice.equalsIgnoreCase("A")) {
			entry();
			while (check(sideA, sideB, sideC).equals("invalid")) {
				
				System.out.println("Enter the Correct Values");
				entry();
				
			}
			calcArea(sideA, sideB, sideC);
			
			myWriter.println("Side A: " + sideA);
			myWriter.println("Side B: " + sideB);
			myWriter.println("Side C: " + sideC);
			myWriter.println("Area is: " + area);
			
		} else if (choice.equalsIgnoreCase("B")) {
			entry2();
			
			calcArea(base, height);
			
			myWriter.println("Base: " + base);
			myWriter.println("Heigth: " + height);
			myWriter.print("Area is: " + area);
		} else {
			System.out.println("Invalid Choice");
		}
		
		myWriter.close();
		
	}
	
	public static String check(double a, double b, double c) { //check values
		
		if (a < b + c && b < a + c && c < a + b) {
			return "valid";
		}
		
		return "invalid";
	}
	
	public static void entry(){//accept entries three sides
		
		
		System.out.print("Enter a side A: ");
		sideA = keys.nextDouble();
		keys.nextLine();
		
		System.out.print("Enter a side B: ");
		sideB = keys.nextDouble();
		keys.nextLine();
		
		System.out.print("Enter a side C: ");
		sideC = keys.nextDouble();
		keys.nextLine();
		
	}
	
	public static void entry2() {//accept entries for base and height
		
		System.out.print("Enter a base: ");
		base = keys.nextDouble();
		keys.nextLine();
		
		System.out.print("Enter a height: ");
		height = keys.nextDouble();
		keys.nextLine();
		
	}
	
	public static void calcArea(double a, double b, double c) { //calculate area 3 sides
		
		
		double sp = (a + b + c) / 2;
		
		area = Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));
		
		System.out.println("Area is: " + area);
		
		
	}
	
	public static void calcArea(double a, double b){ //calculate area 2 sides
		
		
		area = 0.5 * a * b;
		
		System.out.println("Area is: " + area);
		
		
	}
	

}
