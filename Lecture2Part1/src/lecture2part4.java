import java.util.Scanner;

public class lecture2part4 {

	public static void main(String[] args) {
		
		Scanner keys = new Scanner(System.in);
		
		int homeTask1, homeTask2, test, exam, result, finalGrade;
		
		String name;
		
		System.out.println("what is your name? ");
		name = keys.nextLine();
		
		System.out.println("Please " + name + ", input your result for hometask 1");
		homeTask1 = keys.nextInt();
		
		if (homeTask1 > 10 || homeTask1 < 0) {
			System.out.println("Invalid Result! Max is 10 Marks");
		}
		
		System.out.println("Please " + name + ", input your result for hometask 2");
		homeTask2 = keys.nextInt();
		
		if (homeTask2 > 10 || homeTask2 < 0) {
			System.out.println("Invalid Result! Max is 10 Marks");
		}
		
		System.out.println("Please " + name + ", input your result for midterm test");
		test = keys.nextInt();
		
		if (test > 30 || test < 0) {
			System.out.println("Invalid Result! Max is 30 Marks");
		}
		
		System.out.println("Please " + name + ", input your result for examination");
		exam = keys.nextInt();
		
		if (exam > 50 || exam < 0) {
			System.out.println("Invalid Result! Max is 50 Marks");
		}
		
		result = homeTask1 + homeTask2 + test + exam;
		
		System.out.println(name + " gained a total of " + result + " marks");
		
		if (result < 51) {
			finalGrade = 0;
		} else if (result >= 51 && result < 61) {
			finalGrade = 1;
		} else if (result >= 61 && result < 71) {
			finalGrade = 2;
		} else if (result >= 71 && result < 81) {
			finalGrade = 3;
		} else if (result >= 81 && result < 91) {
			finalGrade = 4;
		} else {
			finalGrade = 5;
		}
		
		System.out.println(name + "'s grade for the course is " + finalGrade );
		

	}

}
