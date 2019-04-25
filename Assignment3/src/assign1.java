import java.util.Scanner;

public class assign1 {

	public static void main(String[] args) {
		
		Scanner keys = new Scanner(System.in);
		
		String currency = "";
		
		System.out.print("Choose a currency: ");
		currency = keys.nextLine();
		
		double rate = 0; //variable for exchange rates on 7th March, 2019
		
		switch (currency) {
			case "USD":
				rate = 1.130854;
				break;
			case "GBP":
				rate = 0.860783;	
				break;
			case "INR":
				rate = 79.151795;
				break;
			case "AUD":
				rate = 1.605104;	
				break;
			case "CAD":
				rate = 1.517811;
				break;
			case "SGD":
				rate = 1.534626;	
				break;
			case "AED":
				rate = 4.153062;
				break;
			case "CHF":
				rate = 1.136002;	
				break;
			case "CNY":
				rate = 7.584487;
				break;
			case "DKK":
				rate = 7.460791;	
				break;
			case "HKD":
				rate = 8.876852;
				break;
			case "HUF":
				rate = 315.410156;	
				break;
			case "JPY":
				rate = 126.319875;
				break;
			case "MXN":
				rate = 21.924406;	
				break;
			case "MYR":
				rate = 4.621637;
				break;
			case "NOK":
				rate = 9.798434;	
				break;
			case "NZD":
				rate = 1.666869;
				break;
			case "PHP":
				rate = 59.060426;	
				break;
			case "RUB":
				rate = 74.634547;
				break;
			case "SEK":
				rate = 10.552636;	
				break;
			case "TRY":
				rate = 6.154654;
				break;
			case "THB":
				rate = 35.959440;	
				break;	
			case "ZAR":
				rate = 16.204913;	
				break;
			case "BGN":
				rate = 1.9558;
				break;
			case "CZK":
				rate = 25.592;	
				break;
			case "PLN":
				rate = 4.2996;
				break;
			case "RON":
				rate = 4.7463;	
				break;
			case "ISK":
				rate = 136.80;
				break;
			case "HRK":
				rate = 7.4210;	
				break;
			case "NGN":
				rate = 408.2380048434;	
				break;
			case "ZWD":
				rate = 409.2592994717;
				break;
			case "ZMW":
				rate = 13.5986235643;	
				break;
			case "YER":
				rate = 283.0524760492;
				break;
			case "XPT":
				rate = 0.0013685533;	
				break;
			case "XPF":
				rate = 119.3317422368;
				break;
			case "XPD":
				rate = 0.0007328120;	
				break;
			case "XOF":
				rate = 655.9569999663;
				break;
			case "XCD":
				rate = 3.0561239396;	
				break;
			case "XAF":
				rate = 655.9569999663;
				break;
			case "VND":
				rate = 26257.5219829294;	
				break;
			case "UZS":
				rate = 9492.7466321333;
				break;
			case "UYU":
				rate = 36.9449256777;	
				break;
			case "TOP":
				rate = 2.5389674644;
				break;
			case "TJS":
				rate = 10.6735373018;	
				break;
			case "LBP":
				rate = 1704.7758882387;
				break;	
			default:
				System.out.println("Invalid Currency");
				
		}
		
		for (int i = 1; i <= 10; i++) {
			System.out.println((i) + " EUR" + " is " + (i * rate) + " " + currency);
		}

	}

}
