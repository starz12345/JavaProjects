import java.util.Scanner;

public class lecture2part3 {

	public static void main(String[] args) {
		
		Double price, priceToPay;
		
		
		/** price = 1000.00;
		
		if(price > 100) {
			System.out.println("Discount : 10%");
			priceToPay = price * 0.9;
		} else {
			System.out.println("No Discount");
			priceToPay = price;
		}
		System.out.println("You should pay $" + priceToPay);	
		
		System.out.println("-----------------------");
		
		if(price >= 100) {
			System.out.println("Discount : 10%");
			priceToPay = (price - 100) * 0.9;
		} else {
			System.out.println("No Discount");
			priceToPay = price;
		}
		System.out.println("You should pay $" + priceToPay); **/
		
		Scanner keys = new Scanner(System.in);
		System.out.println("What is the purchase amount?");
		
		price = keys.nextDouble();
		
		if ( price > 0 && price < 100 ) {
			System.out.println("No Discount");
			System.out.println("You will pay $" + price);
		} else if(price >= 100 && price < 1000) {
			System.out.println("You have a discount of 10%");
			priceToPay = price * 0.9;
			System.out.println("You will pay $" + priceToPay);
		} else if (price >= 1000 && price < 2000) {
			System.out.println("You have a discount of 15%");
			priceToPay = price * 0.85;
			System.out.println("You will pay $" + priceToPay);
		} else if (price >= 2000){
			System.out.println("You have a discount of 20%");
			priceToPay = price * 0.80;
			System.out.println("You will pay $" + priceToPay);
		} else {
			System.out.println("Invalid Price");
		}
		
		
		
		

	}

}



