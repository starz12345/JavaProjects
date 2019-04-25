
public class Hamburger {
	private Burger burger;
	private boolean addTomato;
	private boolean addLettuce;
	private boolean addCarrot;
	private boolean addSauce;
	
	public Hamburger(boolean addTomato, boolean addLettuce, boolean addCarrot, boolean addSauce) {
		this.addTomato = addTomato;
		this.addLettuce = addLettuce;
		this.addCarrot = addCarrot;
		this.addSauce = addSauce;
	}

	public void setAddTomato(boolean addTomato) {
		if (addTomato == true) {
			getBurger().setPrice(getBurger().getPrice() + 2); 
			System.out.println("Tomato Added");
		}
		this.addTomato = addTomato;
	}

	public void setAddLettuce(boolean addLettuce) {
		if (addLettuce == true) {
			getBurger().setPrice(getBurger().getPrice() + 2); 
			System.out.println("Lettuce Added");
		}
		this.addLettuce = addLettuce;
	}

	public void setAddCarrot(boolean addCarrot) {
		if (addCarrot == true) {
			getBurger().setPrice(getBurger().getPrice() + 1); 
			System.out.println("Carrot Added");
		}
		this.addCarrot = addCarrot;
	}

	public void setAddSauce(boolean addSauce) {
		if (addSauce == true) {
			getBurger().setPrice(getBurger().getPrice() + 1.5); 
			System.out.println("Sauce Added");
		}
		this.addSauce = addSauce;
	}

	public Burger getBurger() {
		return burger;
	}

	public void setBurger(Burger burger) {
		this.burger = burger;
	}
	
	
	
	
	
	

}
