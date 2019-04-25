import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
	
	public static ArrayList<String> contact = new ArrayList<String>();
	
	public static Scanner keys = new Scanner(System.in);
	
	public  static ArrayList<String> getContact() {
		return contact;
	}
	
	public static void instructions() {
		
		System.out.println("1 - Get a list of contacts");
		System.out.println("2 - Add new contacts");
		System.out.println("3 - Update contacts");
		System.out.println("4 - Remove contacts");
		System.out.println("5 - Search contacts");
		System.out.println("0 - Quit");
		
	}



	public static void addContact() {
		
		System.out.print("Enter your name: ");
		String name = keys.nextLine();
		System.out.print("Enter your number: ");
		String phone = keys.nextLine();
		
		contact.add(name);
		contact.add(phone);
		
	}
	
	public static void modifyContact() {
		
		System.out.print("Enter Value to modify: ");
		String name = keys.nextLine();
		
		System.out.print("Enter new to Value: ");
		String newVal = keys.nextLine();
		
		int position = search(name);
		
		contact.set(position, newVal);
		
	}
	
	public static void removeContact() {
		
		System.out.print("Enter Value to remove: ");
		String name = keys.nextLine();
		
		contact.remove(name);
		
	}
	
	public static int search(String contact) {
		
		return contact.indexOf(contact);
		
	}
	
	public static void searchItem() {
		
		System.out.print("Enter Value to search: ");
		String name = keys.nextLine();
		
		if (contact.indexOf(name) > 0) {
			System.out.println(name + " Found");
		} else {
			System.out.println(name + " Not Found");
		}
		
	}
	
	

}
