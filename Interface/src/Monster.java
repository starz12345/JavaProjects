import java.util.ArrayList;
import java.util.List;

public class Monster implements Saveable{
	
	private String name;
	private int health;

	public Monster(String name) {
		
		this.name = name;
		this.health = 1000;
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
		return "Monster  [name=" + name + ", health=" + health + "]";
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
