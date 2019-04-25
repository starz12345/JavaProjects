
public class lecture3part4 {

	public static void main(String[] args) {
		/**
		
		int counter = 0;
		while (counter < 4) {
			System.out.println(counter);
			counter++;
		}
		
		for (int i = 0; i < 4; i++) {
			System.out.println(i);
		}
		
		for (int i = 1; i < 18; i++) {
			System.out.println(i + ". Odin");
		}
		**/
		
		/**
		int i = 0;
		while(i < age.length) {
			System.out.println(age[i]);
			i++;
		}
		**/
		int [] age = {45, 46, 56, 67, 60, 78, 13, 19, 56, 15};
		
		for (int i = 0; i < age.length; i++) {
			
			if (age[i]%2 == 0) {
				System.out.println(age[i] + " is an even number");
			} else {
				System.out.println(age[i] + " is an odd number");
			}
			
		}
		double sum = 0;
		for (int i = 0; i < age.length; i++) {
			sum = sum + age[i];
			
		}

		double avg = sum / age.length;
		System.out.println(avg);
		int count = 0;
		for (int i = 0; i < age.length; i++) {
			
			if (age[i] >= 13 && age[i] < 20)  count++; 	
		}
		System.out.println(count);
		
		int over30 = age.length - count;
		
		count = 0;
		for (int ages : age) {
			if (ages > 30) {
				count++;
			}
			
		}
		
		System.out.println(count + " people are over 30");

	}

}
