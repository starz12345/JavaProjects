import java.util.Scanner;

public class assign2 {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		int math, phy, chem, total;
		
		System.out.print("What is the score in Mathematics? ");
		math = keys.nextInt();
		
		System.out.println();
		
		System.out.print("What is the score in Chemistry? ");
		chem = keys.nextInt();
		
		System.out.println();
		
		System.out.print("What is the score in Physics? ");
		phy = keys.nextInt();
		
		total = math + phy + chem;
		
		boolean pass, pass2; //Create boolean var for both eligibility situations.
		
		pass = math >= 65 && phy >= 55 && chem >= 50 && total >= 180;
		
		pass2 = math + phy >= 140;
		
		System.out.println();
		
		if (pass == true || pass2 == true) {
			System.out.println("The Candidate is Eligible for Admission.");
		} else {
			System.out.println("The candidate is not Eligible for Admission");
		}
	}

}
