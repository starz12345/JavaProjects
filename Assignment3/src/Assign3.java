
public class Assign3 {

	public static void main(String[] args) {
		
		int [] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 9, 7, 7, 8};
		
		int countEven = 0; //counter for even numbers
		int countOdd = 0; //counter for odd numbers
		
		for (int n : numbers) {
			if (n%2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
		}
		
		System.out.println("There are " + countEven + " even numbers and " + countOdd + " odd numbers");

	}

}
