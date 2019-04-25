import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		Scanner keys = new Scanner(System.in);
		PhoneBook.instructions();
		
		PhoneBook phone = new PhoneBook();
		boolean quit = false;
		
		while (!quit) {
			
			System.out.print("Enter a number: ");
			int entry = keys.nextInt();
			keys.nextLine();
			
			switch(entry) {
			case 1:
				phone.getContact();
				break;
			case 2:
				phone.addContact();
				break;
			case 3:
				phone.updateContact();
				break;
			case 4:
				phone.removeContact();
				break;
			case 5:
				phone.searchItem();
				break;
			case 0:
				System.out.println("Done");
				quit = true;
				break;
			default:
				System.out.println("Invalid input");
				break;
				
			}
		}
		keys.close();
		
		
	}
	
}
