public class BarkingDog {
    
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean test = (0 <= hourOfDay && hourOfDay < 8) || (23 >= hourOfDay && hourOfDay > 22);
        if (barking == true && test == true){
            return true;
        } else {
            return false;
        }
        
    }
 
}