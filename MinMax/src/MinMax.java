import java.util.Arrays;

public class MinMax {
	
	public static void main(String[] args) {
		
			int[] arr = {1, 2, 3, 4, 5, 6, 6, 8, 10, -1, 2, 900};
			
			int min = arr[0];
			int max = arr[0];
			
			for (int i = 0; i < arr.length-1; i+=2) {
				if (arr[i] < arr[i + 1]) {
					if (arr[i + 1] > max) max = arr[i + 1];
					if (arr[i] < min) min = arr[i];
					
				} else if (arr[i] > arr[i + 1]){
					if (arr[i + 1] < min) min = arr[i + 1];
					if (arr[i] > max) max = arr[i];
				}
				System.out.print(".");
			}
			
			System.out.println(min + " " + max);
			int [] temperatures = { -2, 0,1, 5, 4, 2, -1};
			
			min = temperatures[0];
			max = temperatures[0];
			
			
			for (int i = 0; i < temperatures.length-1; i+=2) {
				if (temperatures[i] < temperatures[i + 1]) {
					if (temperatures[i + 1] > max) max = arr[i + 1];
					if (temperatures[i] < min) min = temperatures[i];
					
				} else if (temperatures[i] > temperatures[i + 1]){
					if (temperatures[i + 1] < min) min = temperatures[i + 1];
					if (temperatures[i] > max) max = temperatures[i];
				}
				System.out.print(".");
			}
			
			System.out.println(min + " " + max);
			
			min = minValue(temperatures);
			max = maxValue(temperatures);
			
			System.out.println(min + " " + max);
			
			min = minValue(arr);
			max = maxValue(arr);
			
			System.out.println(min + " " + max);
			
			double avg = avgValue(temperatures);
			System.out.println(avg);
			
			avg = avgValue(arr);
			System.out.println(avg);
			
			for(int i: temperatures) {
				if (i > avgValue(temperatures)) {
					System.out.println(i);
				}
			}
			
			Arrays.sort(temperatures);
			
			
		
	}
	
	public static int minValue(int [] a) {
		int min = Integer.MAX_VALUE;
		
		for (int b : a) {
			if(b < min) min = b;
		}
		return min;
	}
	public static int maxValue(int [] a) {
		int max = Integer.MIN_VALUE;
		
		for (int b : a) {
			if(b > max) max = b;
		}
		return max;
	}
	
	public static double avgValue(int[] a) {
		int sum = 0;
		for (int b : a) {
			sum += b;
		}
		return sum / a.length;
	}

}
