import java.util.Scanner;

public class TwentyQuestions {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		String que1, que2;
		
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try to guess it.");
		System.out.println("");
		
		System.out.print("Question 1) Is it animal, vegetable, or mineral?\n" +
							">");
		que1 = keys.nextLine();
		
		System.out.println("Question 2) Is it bigger than a breadbox?");
		que2 = keys.nextLine();
		
		System.out.println("");
		
		
		if (que1.equals("animal") && que2.equals("no"))System.out.println("My guess is that you are thinking of a squirrel.");
		if (que1.equals("animal") && que2.equals("yes")) System.out.println("My guess is that you are thinking of a mouse.");
		if(que1.equals("vegetable") && que2.equals("no")) System.out.println("My guess is that you are thinking of a carrot.");
		if(que1.equals("vegetable") && que2.equals("yes")) System.out.println("My guess is that you are thinking of a watermelon.");
		if(que1.equals("mineral") && que2.equals("no")) System.out.println("My guess is that you are thinking of a paper clip.");
		if(que1.equals("mineral") && que2.equals("yes")) System.out.println("My guess is that you are thinking of a Camaro.");
		
		System.out.println("I would ask you if I'm right, but I don't actually care.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
