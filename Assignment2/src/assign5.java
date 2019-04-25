import java.util.Scanner;

public class assign5 {
	
	public static void main(String[] args) {
		
		Scanner keys = new Scanner(System.in);
		
		int h, min, tMin;
		
		System.out.print("Input Hours: ");
		h = keys.nextInt();
		
		System.out.print("Input Minutes: ");
		min = keys.nextInt();
		
		tMin = (h * 60) + min;
		
		System.out.println("Total: " + tMin + " minutes");
		

}
}