package com.odinson;
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		
//		for(int i = 0; i <=10;i++) {
//			System.out.println(Series.nSum(i));
//		}
//		
//		System.out.println("============================");
//		System.out.println();
//		
//		for(int i = 0; i <=10;i++) {
//			System.out.println(Series.factorial(i));
//		}
//		
//		System.out.println("============================");
//		System.out.println();
//		
//		for(int i = 0; i <=10;i++) {
//			System.out.println(Series.fibonacci(i));
//		}
		
//		String text = "Tallinn, Harjumaa, Estonia";
//		System.out.println(text.substring(11));
//		System.out.println(text.indexOf(" "));
//		
//		String[] names = new String[6];
//		names[1] = "Tallinn";
//		names[4] = "Tartu";
//		System.out.println(names.length);
		
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		        //Scanner keys = new Scanner(System.in);
//		        int n = keys.nextInt();
//		        keys.nextLine();

		        int [] A = new int[5];
		        
//		        for (int i = 0; i < A.length; i++){
//		            n = keys.nextInt();
//		            keys.nextLine();
//		            A[i] = n;
//		        }
		        
		        A[0] = 1;
		        A[1] = -2;
		        A[2] = 4;
		        A[3] = -5;
		        A[4] = 1;
//		        A[5] = 1;
//		        A[6] = -2;
//		        A[7] = 4;
//		        A[8] = -5;
//		        A[9] = 1;
		        int count = 0;
		        
		        for (int i = 1, k = A.length - 1; i < A.length; i++, k--) {
		        	int sum = 0;
		        	int[] C = Arrays.copyOfRange(A, i, k);
		        	System.out.println(Arrays.toString(C));
		        	for (int j = 0; j < C.length; j++){
		                sum += C[j];
		                //System.out.println(sum);
		            }
		        	if (sum < 0) count++;
		        	if (i + 1 >= k) break;
		        	
		        }
		        
		        for (int i = 0; i < A.length; i++){
		        	
		        	
		        	if ((i + 1) < A.length) {
		        		//System.out.println(A[i] + A[i+1]);
		        		if (A[i] + A[i+1] < 0) count++;
		        		
		        	}
		        	int sum = 0;
		            int[] B = Arrays.copyOfRange(A, i, A.length);
		            System.out.println(Arrays.toString(B));
		            for (int j = 0; j < B.length; j++){
		                sum += B[j];
		                //System.out.println(sum);
		            }
		            
		            
		            if (sum < 0) count++;
		            
		        }

		        for (int o : A) {
		            if (o < 0) count++;
		        }

		        System.out.println(count);

		    }
		




	

}
