import java.util.Scanner;

public class assign1 {

	public static void main(String[] args) {
		int grade, bonus = 0;
		
		Scanner keys = new Scanner(System.in);
		
		System.out.println("What is your grade? ");
		
		grade = keys.nextInt();
		
		if (grade == 101) bonus = 1000;
		if (grade == 102) bonus = 1500;
		if (grade == 103) bonus = 2000;
		
		System.out.println("Your Grade is " + grade + ", and your bonus is " + bonus);
		
		
		

	}

}
