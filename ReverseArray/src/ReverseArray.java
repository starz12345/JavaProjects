import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 8, 5, 6, 7};
		
		
		System.out.println(Arrays.toString(array));
		
		System.out.println(Arrays.toString(reverse(array)));
		
		System.out.println(Arrays.toString(reverseCopy(array)));
		
		
		
		int j = 10;
		
		System.out.println(test(j));
		System.out.println(j);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println(df.format(0.898));
	}
	
	
	public static int test( int j) {
		j = j - 1;
		
		return j;
		
	}
	
	public static int[] reverseCopy(int [] array) {
		
		int[] reversed = new int [array.length];
		
		for (int i = 0, j = array.length - 1;i < array.length; i++, j--) {
			
			reversed[i] = array[j];
			System.out.print(".");
			
		}

		return reversed;
		
	}
	
	public static int[] reverse(int [] array) {
		
		for (int i = 0, j = array.length - 1;i < array.length/2; i++, j--) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			
			System.out.print(".");
		}
		
		
		
		return array;
		
	}
	
	

}
