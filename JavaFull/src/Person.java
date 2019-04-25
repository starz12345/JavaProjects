
public class Person {
	
	private int age;
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		
		return firstName;
		
	}
	
	public String getLastName() {
		
		return this.lastName;
		
	}
	
	public int getAge() {
		
		return this.age;
		
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
		
	}
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
		
	}
	
	public void setAge(int age) {
		if (age < 0 || age > 100) {
			this.age = 0;
		} else {
			this.age = age;
		}
		
	}
	
	public boolean isTeen() {
		
		if (this.age > 12 && this.age < 20) {
			return true;
		}
		
		return false;
		
	}
	
    public String getFullName() {
    	
    	if (this.firstName.isEmpty()) {
    		return this.lastName;
    	} else if (this.lastName.isEmpty()) {
    		return this.firstName;
    	}
    	if (this.firstName.isEmpty() == false && this.lastName.isEmpty() == false) {
    		return this.firstName + " " + this.lastName;
    	}
    	
    	return "";
		
	}
    
   
	

}
