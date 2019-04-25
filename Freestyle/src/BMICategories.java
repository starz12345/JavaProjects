import java.util.Scanner;

public class BMICategories {

	public static void main(String[] args) {
		
		Scanner keys = new Scanner(System.in);
		double h,w,bmi;
		System.out.print("Your height in m: ");
		h = keys.nextDouble();
		
		System.out.print("Your weight in kg: ");
		w = keys.nextDouble();
		
		bmi = w / (h * h);
		
		System.out.println("");
		
		String cat = "";
		if (bmi < 18.5) cat = "underweight";
		if (bmi >= 18.5 && bmi <= 24.9) cat = "normal weight";
		if (bmi >= 25 && bmi <= 29.9) cat = "overweight";
		if (bmi > 30) cat = "obese";
		
		
		
		System.out.println("Your BMI is " + bmi);
		System.out.println("BMI Category: " + cat);

	}

}
