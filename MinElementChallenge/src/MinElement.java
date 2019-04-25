import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
	
	private static Scanner keys = new Scanner(System.in);

	public static void main(String[] args) {
		
		int [] arrayFresh = readIntegers(5);
		
		int min = findMin(arrayFresh);
		
		System.out.println(Arrays.toString(arrayFresh) + " is the array with a minimum value of " + min);

	}
	
	public static int[] readIntegers(int count) {
		int [] array = new int[count];
		
	for (int i = 0; i < count; i++) {
		System.out.print("Enter a Number ");
		array[i] = keys.nextInt();
		keys.nextLine();
	}
		
		return array;
	}
	
	public static int findMin(int [] array) {
		
		Arrays.sort(array);
		
		return array[0];
		
	}

}
