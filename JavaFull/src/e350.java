
public class e350 extends Benz {
	
	private String drive;
	private int seats;
	private String color;
	
	
	public e350(String drive, int seats, String color) {
		super("350", 2019, 4);
		this.drive = drive;
		this.seats = seats;
		this.color = color;
	}


	@Override
	public String getName() {
		return "Brabus";
	}


	public String getDrive() {
		return drive;
	}


	public int getSeats() {
		return seats;
	}


	public String getColor() {
		return color;
	}
	

}
