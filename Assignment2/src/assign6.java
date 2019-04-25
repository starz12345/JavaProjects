import java.util.Scanner;

public class assign6 {

	public static void main(String[] args) {
		
		Scanner keys = new Scanner(System.in);
		
		int h, min;
		
		System.out.print("Input Minutes: ");
		min = keys.nextInt();
		
		h = min / 60;
		
		min = min%60;
		
		System.out.println(h + " Hours, " + min + " Minutes");

	}

}
