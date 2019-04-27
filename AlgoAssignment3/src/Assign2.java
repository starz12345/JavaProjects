public class Assign2 {
	public static void main(String[] args) {
		
		int [][] array = {{-3, 33, 8, 2, 7, 6, 66, 266},
						  {1, 0, 2, 0, 13, -5, 7, 0},
						  {0, 0, 0, 4, 0, 44, 5, 0},
						  {6, 5, 5, 34, 6, 0, 0, 2}};
		
		
		for (int[] i : array) {
			for (int j : i) System.out.print(j + " ");
			
			System.out.println();
		}
		
		System.out.println("Average: " + findAverage(array));
		
		System.out.println("Average in row 0: " + findAverageRow(array, 0));
		
		System.out.println("Minimum in column 0: " + minValueColumn(array, 0));
		
		System.out.println("Maximum in row 1: " + maxValueRow(array, 1));
		
		System.out.println("Average value in row 2: " + findAverageRow(array, 2));
		
		System.out.println("Average value in column 6: " + findAverageColumn(array, 6));
		
		
	}
	
	public static double findAverage(int[][] array) {
		
		double sum = 0;
		int length = 0;
		
		for (int i [] : array) {
			for (int j : i) sum += j;
			length += i.length; //add the length of each array in the 2d array
		}
		
		return sum / length;
		
	}
	
	public static double findAverageRow(int[][] array, int row) {
		
		double sum = 0;
		for (int j : array[row]) sum += j;
		
		return sum / array[row].length;
		
	}
	
	public static double findAverageColumn(int[][] array, int column) {
		
		double sum = 0;
		
		for (int[] j : array) sum += j[column];
		
		return sum / array.length;
		
	}
	
	public static int minValueColumn(int[][] array, int column) {
		
		int min = Integer.MAX_VALUE;

		for (int[] j : array) {
			if (j[column] < min) min = j[column];
		}
		return min;
		
	}
	
	public static int maxValueRow(int[][] array, int row) {
		
		int max = Integer.MIN_VALUE;
		
		for (int j : array[row]) {
			if (j > max) max = j;
		}
		return max;
	}

}
