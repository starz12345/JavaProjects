
public class Benz extends Vehicle {

	private String model;
	private int year;
	private int tyres;
	
	
	public Benz(String model, int year, int tyres) {
		super("Benz", 1, 250, "hand");
		this.model = model;
		this.year = year;
		this.tyres = tyres;
	}


	public String getModel() {
		return model;
	}


	public int getYear() {
		return year;
	}


	public int getTyres() {
		return tyres;
	}
	
	

}
