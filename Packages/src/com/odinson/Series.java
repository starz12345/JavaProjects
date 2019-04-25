package com.odinson;

public class Series {
	
	public static int nSum(int n) {
		
		int sum = 0;
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static int factorial(int n) {
		
		int sum = 1;
		if (n == 0) return 0;
		if (n == 1) return 1;
		for (int i = n; i > 0; i-- ) {
			sum *= i;
		}
		
		return sum;
	}
	
	public static int fibonacci(int n) {
		
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		int sum = fibonacci(n - 1) + fibonacci(n-2);
		
		return sum;
	}
	
}
