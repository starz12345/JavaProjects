
public class DecimalComparator{
	
    
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
    	//DecimalFormat df = new DecimalFormat("#.###");
       // df.setRoundingMode(RoundingMode.DOWN);

    	a = (int) (a * 1000);
        b = (int) (b * 1000);
      
       
       System.out.println(a);
       System.out.println(b);
       
       if (a == b) {
    	   return true;
       } else {
    	   return false;
       }
       
    }
 
}