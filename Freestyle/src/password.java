import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		
		Scanner keys = new Scanner(System.in);
		
		int userName, passWord;
		
		System.out.print("Enter Username ==> ");
		userName = keys.nextInt();
		
		System.out.print("Enter Password ==> ");
		passWord = keys.nextInt();
		
		System.out.println("Now you can login");
		
		System.out.println(userName);
		System.out.println(passWord);
		
		
		int user = 0, pass = 0;
		
		while (user != userName) {
			System.out.println("Username");
			user = keys.nextInt();
			
			//System.out.println("Password");
			//pass = keys.nextLine();
			
			System.out.println(user);
			//System.out.println(pass);
			
			if (user == userName) {
				System.out.println("Login Authorized");
			} else {
				System.out.println("Login Failed");
			}
		}
		
		System.out.println("Welcome");

	}

}
