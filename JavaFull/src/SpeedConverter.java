
public class SpeedConverter {
	
	
	 public static void printConversion(double kilometersPerHour) {
			
			if (kilometersPerHour < 0) {
				System.out.println("Invalid Value");
			} else {
			    long speed = toMilesPerHour(kilometersPerHour);
			
		        System.out.println(kilometersPerHour + " km/h = " +  speed + " mi/h");
			}
			
			
		}
		
		public static long toMilesPerHour(double kilometersPerHour) {
			if (kilometersPerHour < 0) {
				return -1;
			} else {
				double speed = kilometersPerHour / 1.609;
				
				long value = Math.round(speed);
				
				return value;
			}
		}
	

}
