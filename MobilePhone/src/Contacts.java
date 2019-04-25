
public class Contacts extends MobilePhone{
	
	public static void main(String[] args) {
		
		
		boolean quit = false;
		
		instructions();
		
		while (!quit) {
			
			System.out.print("Enter a number: ");
			int entry = keys.nextInt();
			keys.nextLine();
			
			switch(entry) {
			case 1:
				System.out.println(getContact());
				break;
			case 2:
				addContact();
				break;
			case 3:
				modifyContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				searchItem();
				break;
			case 0:
				System.out.println("Bye");
				quit = true;
				break;
			default:
				System.out.println("Invalid input");
				break;
				
			}
		}
		
		
		
		
	}

}
