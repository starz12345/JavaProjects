
public class Burger {
	private String type;
	private String name;
	private double price;
	private String meat;
	private double basePrice = 10;
	

	public double getBasePrice() {
		return basePrice;
	}

	public Burger(String type, String name, String meat) {
		this.type = type;
		this.name = name;
		this.price = 10;
		this.meat = meat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

	public String getMeat() {
		return meat;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
