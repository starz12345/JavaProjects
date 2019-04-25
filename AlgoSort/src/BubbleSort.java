
public class BubbleSort {

	public static void main(String[] args) {

		int[] array = { 8, 4, 6, 9, 2, 3, 1 };
		
		for (int i = 0; i < bubbleSort(array).length; i++) {
			System.out.print(bubbleSort(array)[i] + " ");
			
		}


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

}
