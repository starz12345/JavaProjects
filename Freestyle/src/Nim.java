import java.util.Random;
import java.util.Scanner;

public class Nim {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		Random  ran = new Random();
		
		int a = 5, b = 3, c = 1, rem = 0;
		String ar = "", br = "", cr = "";
		String player1, player2;
		boolean cond1, cond2, cond3;
		
		int stringRep = 1 + ran.nextInt(3);
		String genString = "";
		
		if (stringRep == 1) genString = "A";
		if (stringRep == 2) genString = "B";
		if (stringRep == 3) genString = "C";
		
		System.out.println(genString);
		
		
		
		System.out.println(stringRep);
	    
	    System.out.print("Who do you want to play with? COM or HUMAN: ");
	    
	    String game = keys.nextLine();
	    
	    for (int i = 0 ; i < a ; i++) ar += "*";
		for (int i = 0 ; i < b ; i++) br += "*";
		for (int i = 0 ; i < c ; i++) cr += "*";
		
		System.out.println("A: " + ar);
		System.out.println("B: " + br);
		System.out.println("C: " + cr);
		
		int setPlayer = 2;
		
		String pile = "";
		
		System.out.print("Player Enter Your Name: ");
		player1 = keys.nextLine();
	    
	    if (game.equals("HUMAN")) {
	    	
			
			System.out.print("Player 2 Enter Your Name: ");
			player2 = keys.nextLine();		
			System.out.println("");

			do {
				if (setPlayer == 1) { // Player Selector for Player 1
					
					System.out.print(player1 + " Choose A Pile: ");
					pile = keys.nextLine();
					
					while ((pile.contentEquals("A") && a == 0) || (pile.contentEquals("B") && b == 0) || (pile.contentEquals("C") && c == 0)) { //loop to check empty pile
						System.out.println("Nice try, " + player1 +". That pile is empty. ");
						System.out.print("Choose Again");
						pile = keys.nextLine();
					}
					
					System.out.print("How many to remove from pile " + pile + ":");
					rem = keys.nextInt();
					keys.nextLine();
					
					while((pile.contentEquals("A") && a < rem) || (pile.contentEquals("B") && b < rem) || (pile.contentEquals("C") && c < rem)) { // loop to check cheating
						
						System.out.print("Pile " + pile +  " doesn't have that many. Try again:");
						rem = keys.nextInt();
						keys.nextLine();
						
						
					}
					
					while (rem < 1) { //loop to check less than 1.
							System.out.print("You must choose at least 1. How many? ");
							rem = keys.nextInt();
							keys.nextLine();
					}
					System.out.println("");
					
					setPlayer = 2;
					
				}  else {	// Player Selector for Player 2
					System.out.print(player2 + " Choose A Pile: ");
					pile = keys.nextLine();
					
					while ((pile.contentEquals("A") && a == 0) || (pile.contentEquals("B") && b == 0) || ( pile.contentEquals("C") && c == 0)) { //loop to check empty pile
						System.out.println("Nice try, " + player2 +". That pile is empty. ");
						System.out.print("Choose Again");
						pile = keys.nextLine();
					}
					
					System.out.print("How many to remove from pile " + pile + ":");
					rem = keys.nextInt();
					keys.nextLine();
					
					while((pile.contentEquals("A") && a < rem) ||( pile.contentEquals("B") && b < rem )|| pile.contentEquals("C") && c < rem) { // loop to check cheating
						System.out.print("Pile " + pile +  " doesn't have that many. Try again:");
						rem = keys.nextInt();
						keys.nextLine();
					}
					
					while (rem < 1) { //loop to check less than 1.
						System.out.print("You must choose at least 1. How many? ");
						rem = keys.nextInt();
						keys.nextLine();
				}
					
					System.out.println("");
					setPlayer = 1;
					
					
				}
				
				
				if (pile.contentEquals("A")) {
					a = a - rem;
					ar = "";
					for (int i = 0 ; i < a ; i++) ar += "*";
				} else if (pile.contentEquals("B")) {
					b = b - rem;
					br = "";
					for (int i = 0 ; i < b ; i--) br += "*";
				} else if (pile.contentEquals("C")) {
					c = c - rem;
					cr = "";
					for (int i = 0 ; i < c ; i--) cr += "*";
				} else {
					System.out.println("Invalid Pile");
				}
				
				System.out.println("A: " + ar);
				System.out.println("B: " + br);
				System.out.println("C: " + cr);
				
				
				System.out.println("");
				
				cond1 = a == 1 && b == 0 && c == 0; 
				cond2 = a == 0 && b == 1 && c == 0; 
				cond3 = a == 0 && b == 0 && c == 1; 
				
				if (cond1 == true || cond2 == true|| cond3 == true) {
					break;
				}
				
			}while(a > 0 || b > 0 || c > 0);
			
			if (cond1 == true || cond2 == true|| cond3 == true) {
				if (setPlayer == 1) {
					System.out.println(player1 + " you must take the last remaining counter, so you lose. " + player2 + " wins!");
				} else {
					System.out.println(player2 + " you must take the last remaining counter, so you lose. " + player1 + " wins!");
				}
			}else if (setPlayer == 2) {
				System.out.println(player2 + ", there are no counters left, so you WIN!");
			} else {
				System.out.println(player1 + ", there are no counters left, so you WIN!");
			}
			
			
			
			System.out.println("All piles are empty. Good job!");
	    }
		
	    if (game.equals("COM")) {
			System.out.println("Com Name: COM");
			
			
			do {
				if (setPlayer == 1) { // Player Selector for Player 1
					
					System.out.print(player1 + " Choose A Pile: ");
					pile = keys.nextLine();
					
					while ((pile.contentEquals("A") && a == 0) || (pile.contentEquals("B") && b == 0) || (pile.contentEquals("C") && c == 0)) { //loop to check empty pile
						System.out.println("Nice try, " + player1 +". That pile is empty. ");
						System.out.print("Choose Again");
						pile = keys.nextLine();
					}
					
					System.out.print("How many to remove from pile " + pile + ":");
					rem = keys.nextInt();
					keys.nextLine();
					
					while((pile.contentEquals("A") && a < rem) || (pile.contentEquals("B") && b < rem) || (pile.contentEquals("C") && c < rem)) { // loop to check cheating
						
						System.out.print("Pile " + pile +  " doesn't have that many. Try again:");
						rem = keys.nextInt();
						
						
						
					}
					keys.nextLine();
					
					while (rem < 1) { //loop to check less than 1.
							System.out.print("You must choose at least 1. How many? ");
							rem = keys.nextInt();
							
					}
					keys.nextLine();
					System.out.println("");
					
					setPlayer = 2;
					
				}  else {	// Player Selector for Player 2
					System.out.print("COM Choose A Pile: ");
					
					stringRep = 1 + ran.nextInt(3);
					genString = "";
					
					if (stringRep == 1) genString = "A";
					if (stringRep == 2) genString = "B";
					if (stringRep == 3) genString = "C";
					pile = genString;
					System.out.print(pile);
					System.out.println();
					
					while ((pile.contentEquals("A") && a == 0 )|| (pile.contentEquals("B") && b == 0 )||( pile.contentEquals("C") && c == 0)) { //loop to check empty pile
						System.out.println("Nice try, COM. That pile is empty. ");
						System.out.println("Choose Again.");
						stringRep = 1 + ran.nextInt(3);
						genString = "";
						
						if (stringRep == 1) genString = "A";
						if (stringRep == 2) genString = "B";
						if (stringRep == 3) genString = "C";
						pile = genString;
						System.out.print(pile);
					}
					
					System.out.println("How many to remove from pile " + pile + ": ");
					rem = 1 + ran.nextInt(9);
					
					System.out.print(rem);
					
					while((pile.contentEquals("A") && a < rem) || (pile.contentEquals("B") && b < rem) || (pile.contentEquals("C") && c < rem)) { // loop to check cheating
						System.out.print("Pile " + pile +  " doesn't have that many. Try again:");
						rem = ran.nextInt(5);
						System.out.print(rem);
					}
					
					
					while (rem < 1) { //loop to check less than 1.
						System.out.print("You must choose at least 1. How many? ");
						rem = 1 + ran.nextInt(9);
						
						System.out.print(rem);
				}
					
					
					System.out.println("");
					setPlayer = 1;
					
					
				}
				
				
				if (pile.contentEquals("A")) {
					a = a - rem;
					ar = "";
					for (int i = 0 ; i < a ; i++) ar += "*";
				} else if (pile.contentEquals("B")) {
					b = b - rem;
					br = "";
					for (int i = 0 ; i < b ; i--) br += "*";
				} else if (pile.contentEquals("C")) {
					c = c - rem;
					cr = "";
					for (int i = 0 ; i < c ; i--) cr += "*";
				} else {
					System.out.println("Invalid Pile");
				}
				
				System.out.println("A: " + ar);
				System.out.println("B: " + br);
				System.out.println("C: " + cr);
				
				
				System.out.println("");
				
				cond1 = a == 1 && b == 0 && c == 0; 
				cond2 = a == 0 && b == 1 && c == 0; 
				cond3 = a == 0 && b == 0 && c == 1; 
				
				if (cond1 == true || cond2 == true|| cond3 == true) {
					break;
				}
				
			}while(a > 0 || b > 0 || c > 0);
			
			if (cond1 == true || cond2 == true|| cond3 == true) {
				if (setPlayer == 1) {
					System.out.println(player1 + " you must take the last remaining counter, so you lose. COM wins!");
				} else {
					System.out.println("COM you must take the last remaining counter, so you lose. " + player1 + " wins!");
				}
			}else if (setPlayer == 2) {
				System.out.println("COM, there are no counters left, so you WIN!");
			} else {
				System.out.println(player1 + ", there are no counters left, so you WIN!");
			}
			
			
			
			System.out.println("All piles are empty. Good job!");
	    	
	    }


		
		
		
	
	}

}
