
public class Person {
	
	private String name;
	private String id;
	private String salary;
	
	public Person(String name, String id, String salary) {
		this.name = name;
		this.id = id;
		this.setSalary(salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary2) {
		this.salary = salary2;
	}
	
	public static Person avgSalary(String s) {
		
		String[] a = s.split(",");
		
		Person p = new Person(a[1], a[0], a[2]);
		
		return p;
		
		
		
	}
	
	

}
