
import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable{
	
	private String name;
	private int health;
	
	public Player(String name) {
		
		this.name = name;
		this.health = 100;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", health=" + health + "]";
	}

	@Override
	public List<String> write() {
		List<String> values = new ArrayList<String>();
		values.add(0, this.name);
		values.add(1, "" + this.health);
		return values;
	}

	@Override
	public void read(List<String> values) {
		if (values.size() > 0) {
			this.name = values.get(0);
			this.health = Integer.parseInt(values.get(1));
					
		}
		
	}
	
	
	
	
	

}
