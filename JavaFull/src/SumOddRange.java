
public class SumOddRange {

	public static void main(String[] args) {
		
		
		System.out.println(sumOdd(13, -13));//3,5,7,9 ;; 3,4,5,6,7,8,9

	}
	
	 public static boolean isOdd (int number){
	        
	        if (number % 2 == 1 && number > 0){
	            return true;
	        }
	        
	        return false;
	        
	    }
	    
	    public static int sumOdd(int start, int end){
	        boolean test = (start <= end) && (start > 0) && (end > 0);
	        int sum;
	        if (test == true){
	            sum = 0;
	            for(int i = start; i <= end; i++) {
	                if(isOdd(i)) {
	                    sum += i;
	                }
	            }
	            
	            return sum;
	        }
	        
	        return -1;
	    }
}