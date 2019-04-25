
public class Main {
	
	public static void main(String[] args) {
		
		Burger burg = new Burger("Bread", "Big Mac", "Pork");
		DeluxBurger bigMac = new DeluxBurger(true, true, true, false);
		
		double price = bigMac.getBurger().getBasePrice();
		
		System.out.println(price);
		
		
	}
	
	

}
