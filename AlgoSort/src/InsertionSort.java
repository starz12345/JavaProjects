
public class InsertionSort {
	
	public static void main(String[] args) {
		
		int[] array = {5,2,4,6,1,3};
		
		
		for (int a: insertionSort(array)) System.out.print(a + " ");
		
		
		
	}
	
	public static int[] insertionSort(int[] array) {
		
		int temp;
		
		for (int i = 1; i < array.length; i++) {
			
			for (int j = i; j > 0; j--) {
				
				if(array[j] < array[j - 1]) {
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
				
			}
		}
		
		return array;
	}

}

