import java.util.Scanner;

public class Adventure1 {

	public static void main(String[] args) {
		
		Scanner keys = new Scanner(System.in);
		
		String input;
		
		System.out.println("WELCOME TO ODIN'S TINY ADVENTURE!");
		System.out.println();
		
		System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" + 
				"\"kitchen\"?");
		input = keys.nextLine();
		
		if (input.equals("kitchen")) {
			System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\n" + 
					"there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" + 
					"or look in a \"cabinet\".");
			input = keys.nextLine();
			if(input.equals("refrigerator")) {
				System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" + 
						"Would you like to eat some of the food? (\"yes\" or \"no\")");
				input = keys.nextLine();				
			} if (input.equals("no")) {
				System.out.println("You die of starvation... eventually.");
			} else if (input.contentEquals("yes")) {
				System.out.println("You Survive");
			}
		} 
		if (input.contentEquals("upstairs")) {
			System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n" + 
					"\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n" + 
					"to go?");
			input = keys.nextLine();
			if (input.contentEquals("bedroom")) {
				System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" + 
						"bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" + 
						"like to open the door? (\"yes\" or \"no\")");
				input = keys.nextLine();
				if (input.contentEquals("no")) {
					System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\n" + 
							"I'm tired of making nested if statements.");
				} else if (input.contentEquals("yes")) {
					System.out.println("Still Game Over Bro");
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
/**
		System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n" + 
				"\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n" + 
				"to go?");
		
		sys
		
**/
	}

}
