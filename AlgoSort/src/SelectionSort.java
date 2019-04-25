import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] array = {64, 25, 12, 22, 11};
		
		for (int a: selectionSort(array)) System.out.print(a + " ");
		
		Arrays.sort(array);
		
		for (int a: array) System.out.print(a + " ");
		
		
		
	}
	
	public static int[] selectionSort(int[] array) {
		int n = array.length;
		for (int k = 0; k < n-1; k++) {
			int min_idx = k;
			for (int i = k + 1; i < n; i++) {
				if (array[i] < array[min_idx]) {
					min_idx = i;
				}
			}
			
			int temp = array[min_idx];
			array[min_idx] = array[k];
			array[k] = temp;
		}
		
		return array;
		
	}

}
