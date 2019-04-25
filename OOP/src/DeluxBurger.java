
public class DeluxBurger extends Hamburger {
	
	private boolean addChips;
	private boolean addDrinks;
	
	public DeluxBurger(boolean addTomato, boolean addLettuce, boolean addCarrot, boolean addSauce) {
		super(addTomato, addLettuce, addCarrot, addSauce);
		this.addChips = true;
		this.addDrinks = true;
		//getBurger().setPrice(getBurger().getPrice() + 5);
	}

	public boolean isAddChips() {
		return addChips;
	}

	public boolean isAddDrinks() {
		return addDrinks;
	}
	
	
	
	
	

}
