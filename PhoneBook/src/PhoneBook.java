import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
	public Scanner keys = new Scanner(System.in);
	
	public List<Contacts> contact = new ArrayList<Contacts>();
	
	public static void instructions() {
		
		System.out.println("1 - Get a list of contacts");
		System.out.println("2 - Add new contacts");
		System.out.println("3 - Update contacts");
		System.out.println("4 - Remove contacts");
		System.out.println("5 - Search contacts");
		System.out.println("0 - Quit");
		
	}
	
	public void getContact() {
		
		if (this.contact.isEmpty()) {
			System.out.println("Phonebook Empty");;
		}
		
		for (Contacts c : this.contact) {
			 System.out.println(c.getContact());
		}
		
		
	}

	public void addContact() {
		System.out.println("Enter name");
		String name = keys.nextLine();
		System.out.println("Enter PhoneNumber");
		String phoneNumber = keys.nextLine();
		
		Contacts contact = new Contacts(name, phoneNumber);
		
		
		this.contact.add(contact);
		
	}

	public void updateContact() {
		System.out.println("Modify \n" +
							"1 - Name \n" +
							"2 - Phone");
		System.out.print("Enter:  ");
		int entry = keys.nextInt();
		keys.nextLine();
		
		switch (entry) {
		case 1:
			System.out.print("Enter Name: ");
			String name = keys.nextLine();
			Contacts c = finder(name);
			if (c != null) {
				System.out.print("Enter New Name: ");
				name = keys.nextLine();
				c.setName(name);
			} else {
				System.out.println(name + " not found");
			}
			break;
		case 2:
			System.out.print("Enter Phone: ");
			String phone = keys.nextLine();
			c = finder(phone);
			if (c != null) {
				System.out.print("Enter New Phone: ");
				phone = keys.nextLine();
				c.setPhoneNumber(phone);
			} else {
				System.out.println(phone + " not found");
			}
		default:
			break;
		}
		
		
		
		
	}
	public void searchItem() {
		
		System.out.print("Enter Value to search: ");
		String name = keys.nextLine();
		
		if (finder(name) != null) {
			System.out.println(name + " Found");
			finder(name).getContact();
		} else {
			System.out.println(name + " Not Found");
		}
		
	}
	
	public Contacts finder(String val) {
		
		for (Contacts c: contact) {
			if (c.getName().equalsIgnoreCase(val) || c.getPhoneNumber().equalsIgnoreCase(val)) {
				return c;
			}
		}
		
		
		return null;
		
	}
	
	public void removeContact() {
	
	System.out.print("Enter Value to remove: ");
	String val = keys.nextLine();
	
	
	if (finder(val) != null) {
		Contacts c = finder(val);
		this.contact.remove(c);
		System.out.println(c.getContact() + " Deleted");
	} else {
		System.out.println(val + " Not Found");
	}
	
}

}
