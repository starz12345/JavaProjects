
public class test {

	public static void main(String[] args) {
		 
		 String personalId = "435408221212";
		 
		 System.out.println(personalId.charAt(0));
		 
		 char gender = personalId.charAt(0);
		 
		 if (personalId.length() != 11) {
			 System.out.println("Invalid Code");	 
		 } else {
			 if (gender == '2' || gender == '4' || gender == '6' || gender == '8' ) {
				 System.out.println("It is a female");
			 } else if(gender == '1' || gender == '3' || gender == '5' || gender == '7') {
				 System.out.println("It is a male");
			 } else {
				 System.out.println("Invalid Code");
			 }

		 }
		 
		 String name = "Lord Fury";
		 int index = name.indexOf(' ') + 1;
		 
		 System.out.println(name.substring(0, 4));
		 System.out.println(name.substring(5, 9));
		 System.out.println(name.substring(index));
		 
		 String location = "New York, United States";
		 String city;
		 String country;
		 index = location.indexOf(',');
		 country = location.substring(index + 2);
		 city = location.substring(0, index);
		 
		 System.out.println(city);
		 System.out.println(country);
		 
		 String names = "Odin, Rufus, Altiar, Enzo, Freya";
		 
		 String [] namesArray = names.split(", ");
		 
		 for (String n : namesArray) {
			 System.out.println(n);
		 }
		
		 
		 

	}

}
