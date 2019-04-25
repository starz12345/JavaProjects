import java.util.Scanner;

public class BMICalc {

	public static void main(String[] args) {
		
		Scanner keys = new Scanner(System.in);
		
		/* double h,w,bmi;
		
		

		System.out.print("Your height in m: ");
		h = keys.nextDouble();
		
		System.out.print("Your weight in kg: ");
		w = keys.nextDouble();
		
		bmi = w / (h * h);
		
		System.out.println("");
		
		System.out.print("Your BMI is " + bmi); */
		

		/* System.out.print("Your height in inches: ");
		hi = keys.nextDouble();
		
		System.out.print("Your weight in pounds: ");
		wp = keys.nextDouble();
		
		h = hi / 39.37;
		
		w = wp / 2.205;
		
		bmi = w / (h * h);
		
		System.out.println("");
		
		System.out.print("Your BMI is " + bmi); */
		
		double h,w,hi,ft,wp,bmi;
		
		System.out.print("Your height in feet: ");
		ft = keys.nextDouble();
		
		System.out.print("Your height in inches: ");
		hi = keys.nextDouble();
		
		System.out.print("Your weight in pounds: ");
		wp = keys.nextDouble();
		
		hi = (ft * 12) + hi;
		
		h = hi / 39.37;
		hi =1;
		w = wp / 2.205;
		
		bmi = w / (h * h);
		
		System.out.println();
		
		System.out.print("Your BMI is " + bmi);
		
		
		
		
		

	}

}
