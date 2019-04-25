import java.util.Scanner;

public class lecture3part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		
		Scanner keys = new Scanner(System.in);
		
		System.out.println("Month");
		month = keys.nextInt();
		
		String monthString;
		
		switch(month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "Frebruary";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "Invalid Month"; 
			
		}
		
		
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:	
		case 12: 	
			System.out.println("31 days in " + monthString);
			break;
		case 2:
			System.out.println("28 days in " + monthString);
			break;
		case 4: 
		case 6:
		case 9:
		case 11:
			System.out.println("30 days in " + monthString);
			break;
		default:
			System.out.println(monthString);
		
			
		}

	}

}
