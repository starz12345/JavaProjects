import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class assign4 {

	public static void main(String[] args) throws IOException {
		
		Scanner keys = new Scanner(System.in);
		
		System.out.print("Input the number of sides: ");
		int numberOfSides = keys.nextInt();
		keys.nextLine();
		
		System.out.print("Input the side: ");
		int side = keys.nextInt();
		keys.nextLine();
		
		keys.close();
		calcAreaPentagon(numberOfSides, side);
		
		
	}
	
	public static void calcAreaPentagon(int numberOfSides,double side) throws IOException {
		
		File myFile = new File("/Users/victoray/Desktop/Java/assign4/output.txt");
		
		PrintWriter myWriter = new PrintWriter(myFile); 
		
		double area = 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * side * side;
		
		System.out.println("The area of the pentagon is " + area);
		
		myWriter.println("Number of sides: " + numberOfSides);
		myWriter.println("");
		myWriter.println("Side: " + side);
		myWriter.println("");
		myWriter.println("The area of the pentagon is " + area);
		
		
		myWriter.close();
		
		//return area;
	}

}
