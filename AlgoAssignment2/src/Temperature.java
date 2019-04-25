import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);

		String[] weekDays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		int[] temp = new int[7];
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < temp.length; i++) {
				System.out.print("What is the temperature for " + weekDays[i] + ": ");
				temp[i] = keys.nextInt();
				sum += temp[i];
		}

		avg = Double.valueOf(sum) / temp.length;
		System.out.println("\nThe avg temp is " + avg + " degrees. \n");
		System.out.println("The highest temperature was " + temp[maxValue(temp)] + " degrees, on " + weekDays[maxValue(temp)]);
		System.out.println("The lowest temperature was " + temp[minValue(temp)] + " degrees, on " + weekDays[minValue(temp)] + "\n");

		System.out.println("Temperatures above the average:");
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] > avg) System.out.println(temp[i] + " degrees, on " + weekDays[i]);
		}

		System.out.println("\nTemperatures above the average:");
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] > avg) System.out.println(temp[i] + " degrees (Celsius) or " + converter(temp[i]) + " degrees (Fahrenheit), on " + weekDays[i]);
		}
		keys.close();

	}

	public static int minValue(int[] a) {//returns the index of the min value
		int min = Integer.MAX_VALUE;
		int minIndex = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	public static int maxValue(int[] a) {//returns the index of the max value
		int max = Integer.MIN_VALUE;
		int maxIndex = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public static double converter(int temperature) {//convert to fahrenheit
		return (Double.valueOf(temperature) * 9 / 5) + 32;
	}

}
