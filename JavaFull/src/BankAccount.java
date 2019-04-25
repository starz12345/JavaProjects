
public class BankAccount {
	
	private int accountNumber;
	private double balance = 0;
	private String fullName;
	private String email;
	private String phoneNumber;
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
		
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		
		return this.balance;
		
	}
	
	public void setFullname(String fullName) {
		this.fullName = fullName;
	}
	
	public String getFullname() {
		return this.fullName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void deposit(double depositAmount) {
		this.balance = this.balance + depositAmount;
	}
	
	public void withdraw(double withdrawAmount) {
		if (withdrawAmount > this.balance) {
			System.out.println("Insufficient Funds");
		} else {
			this.balance = this.balance - withdrawAmount;
		}
	}
	
	

}
