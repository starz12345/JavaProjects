import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class lecture5part3 {

	public static void main(String[] args) throws IOException {
		
		File myfile = new File("/Users/victoray/Desktop/Java/Lecture5/src/text.txt");
		
		if (myfile.createNewFile() == true) {
			System.out.println("File is created");
		} else {
			System.out.println("File already exists");
		}
		
		
		System.out.println(myfile.length());
		System.out.println(myfile.lastModified());
		System.out.println(myfile.getName());
		System.out.println(myfile.getPath());
		
		PrintWriter writer = new PrintWriter(myfile);
		
		writer.println("James 30");
		writer.println("John 35");
		writer.println("Julia 15");
		writer.close();
		
		FileReader reader = new FileReader(myfile);
		
		BufferedReader breader = new BufferedReader(reader);
		
		String line;
		
		int index;
		
		int age, ageSum = 0;
		
		double avgAge;
		int count = 0;
		
		while ((line = breader.readLine()) != null) {
			System.out.println(line);
			
			index = line.indexOf(" ") + 1;
			System.out.println(line.substring(index));
			
			age = Integer.parseInt(line.substring(index));
			
			ageSum += age; 
			count++;
		}
		
		avgAge = (double) ageSum / count;
		
		System.out.println(avgAge);
		Random ran = new Random();
		
		int number = ran.nextInt(1000);
		
		
		/**File randomFile = new File("/Users/victoray/Desktop/Java/Lecture5/src/randomFile.txt");
		
		writer = new PrintWriter(randomFile);
		
		for (int i = 0; i < 25; i++) {
			
			number = ran.nextInt(1000);
			writer.println(number);
		}
		
		writer.close();
		
		reader = new FileReader(randomFile);
		
		breader = new BufferedReader(reader);
		
		int value;
		
		int sum = 0 , count = 0;
		
		
		while ((line = breader.readLine()) != null) {
			System.out.println(line);
			
			value = Integer.parseInt(line);
			sum = sum + value;
			count++;
			
		}
		
		System.out.println(sum);
		System.out.println(sum / count); **/
		
	}

}
