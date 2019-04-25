import java.util.Random;

public class Arrays2D {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int [] [] array;
		
		 array = new int [10][5];
		 
		 array [0][0] = 7;
		 array [0][1] = 3;
		 array [1][2] = 7;
		 array [1][3] = 8;
		 
//		 for (int i = 0; i < array.length; i++) {
//			 for (int j = 0; j < array[i].length; j++) {
//				 array[i][j] = rand.nextInt(10);
//			 }
//		 }
//		 
//		 for (int i = 0; i < array.length; i++) {
//			 for (int j = 0; j < array[i].length; j++) {
//				 System.out.print(array[i][j] + " ");
//			 }
//			 System.out.println();
//		 }
		 
		 int rating[][] = {{4, 6, 2, 5},
				 		   {7, 9, 4, 9},
				 		   {6, 9, 3, 7}
				 
		 };
		 
//		 for (int i = 0; i < rating.length; i++) {
//			 for (int j = 0; j < rating[i].length; j++) {
//				 System.out.print(array[i][j] + " ");
//			 }
//		 }
		 int sum = 0;
		 
		 for (int j = 0; j < rating[1].length; j++) {
			 sum += rating[1][j];
			 System.out.print(rating[1][j] + " ");
		 }
		 System.out.println();
		 
		 System.out.println(Double.valueOf((double)sum / rating[1].length));
		 System.out.println();
		 
		 int [][] raggedRatings = {{4, 6, 2, 5},
				 				   {7, 9, 4},
				 				   {6, 5, 1, 7},
				 				   {6, 9}};
		 
		 for (int[] s : raggedRatings) {
			 for(int i : s) {
				 System.out.print(i + " ");
				 if (s.length > 3) System.out.println(i);
			 }
			 System.out.println();
		 }
		}
	
	

}
