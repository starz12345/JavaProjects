public class Assign1 {

	public static void main(String[] args) {
		
		int [] array = {77, 20, 2, 33, 13, -5, 87, 566, 6};
		
		int [] temp = array.clone();
		
		for (int i : array) System.out.print(i + " ");
		System.out.println();
		
		System.out.println("Minimum Value: " + minValue(array));
		
		System.out.println("Maximum Value: " + maxValue(array));
		
		System.out.println("Average: " + avgValue(array));
		
		System.out.println("Selection Sort");
		
		array = selectionSort(array);
		
		for (int i : array) System.out.print(i + " ");
		
		array = temp.clone();
		
		System.out.println("\nBubble Sort");
		
		array = bubbleSort(array);
	
		for (int i : array) System.out.print(i + " ");
		
		array = temp.clone();
		
		System.out.println("\nReverse Array");
		array = reverse(array);
		for (int i : array) System.out.print(i + " ");
		
		
		
		

	}
	
	public static int minValue(int[] a) {//returns the index of the min value
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public static int maxValue(int[] a) {//returns the index of the max value
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static double avgValue(int[] array) {
		double sum = 0;
		
		for (int i : array) {
			sum += i;
		}
		return sum / array.length;
	}
	
	public static int[] selectionSort(int[] array) {
		int n = array.length;
		for (int k = 0; k < n-1; k++) {
			int minIndex = k;
			for (int i = k + 1; i < n; i++) {
				if (array[i] < array[minIndex]) {
					minIndex = i;
				}
			}
			
			int temp = array[minIndex];
			array[minIndex] = array[k];
			array[k] = temp;
		}
		
		return array;
		
	}
	
	public static int[] bubbleSort(int[] array) {

		int n = array.length;
		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}
			}
		}
		
		return array;

	}
	
	public static int[] reverse(int [] array) {
		
		for (int i = 0, j = array.length - 1;i < array.length/2; i++, j--) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		
		return array;
		
	}

}
