
public class Overload {

	public static void main(String[] args) {
		
		double tester = calcFeetAndInchesToCentimeters(17, 12);
		
		System.out.println(tester);


	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		
		boolean test = feet >= 0;
		boolean test2 = inches >= 0 && inches <= 12;
		
		if (test == true && test2 == true) {
			double cm  = (inches * 2.54) + (feet * 12 * 2.54);
			return cm;
		}
		
		return -1;
		
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		
		
		boolean test2 = inches >= 0 && inches <= 12;
		
		if (test2 == true) {
			double feet = inches / 12;
			
			inches = inches % 12;
			
			double cm  = calcFeetAndInchesToCentimeters(feet, inches);
			return cm;
		}
		
		return -1;
		
	}

}
