import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		File myFile = new File("/Users/victoray/Documents/Salary.csv");
		FileReader myReader = new FileReader(myFile);
		BufferedReader reader = new BufferedReader(myReader);
		
		String line;
		
		line = reader.readLine();
		
		List<Person> person = new ArrayList<>();
		
		while ((line = reader.readLine()) != null) {
			Person fresh = Person.avgSalary(line);
			person.add(fresh);
		}
		int sum = 0;
		for (int i = 0; i < person.size(); i++) {
			String sal = person.get(i).getSalary();
			sum += Integer.parseInt(sal);
			System.out.println(sal);
		}
		
		Double avg = Double.valueOf(sum / person.size());
		
		System.out.println(avg);
		
		
		
		reader.close();
		
		
		
	}
	
	
}
