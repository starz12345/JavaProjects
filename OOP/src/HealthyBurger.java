
public class HealthyBurger extends Hamburger {
	
	private boolean addBeans;
	private boolean addDietCoke;
	public HealthyBurger(boolean addTomato, boolean addLettuce, boolean addCarrot, boolean addSauce, boolean addBeans,
			boolean addDietCoke) {
		super(addTomato, addLettuce, addCarrot, addSauce);
		if (addBeans == true) {
			getBurger().setPrice(getBurger().getPrice() + 1);; 
		} else {
			this.addBeans = addBeans;
		}
		
		if (addDietCoke == true) {
			getBurger().setPrice(getBurger().getPrice() + 1);; 
		} else {
			this.addDietCoke = addDietCoke;
		}
		
	}
	
	
	

}
