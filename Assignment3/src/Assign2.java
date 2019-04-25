
public class Assign2 {

	public static void main(String[] args) {
		
		int [] numbers = {1, 0, -1, 2, 3, 5, 0, 0 , 1};
		
		int count = 0; //counter for 0
		int count1 = 0; //counter for 1
		int count2 = 0; //counter for -1
		
		for ( int n : numbers) {
			if (n == 0) {
				count++;
			} else if (n == 1) {
				count1++;
			} else if (n == -1) {
			    count2++;
			}
				
		}
		
		if (count >= 1 && count1 >= 1 && count2 >= 1) {
			System.out.println("The array contains 0, 1 and -1.\n"
					+ "0 appears " + count + " time(s), while 1 and -1 appears " + count1 + " & " + count2 + " time(s) respectively.");
		}else {
			System.out.println("The array does not contains 0, 1 and -1.");
		}
		
	}

}
