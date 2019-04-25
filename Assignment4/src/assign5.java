import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class assign5 {

	public static void main(String[] args) throws IOException {
		
		File myFile = new File("/Users/victoray/Desktop/Java/assign4/reader.txt");
		
		PrintWriter myWriter = new PrintWriter(myFile);
		
		FileReader reader = new FileReader(myFile);
		
		BufferedReader myReader = new BufferedReader(reader);
		
		
		for (int i = 0; i < 10 ; i++) { //writer to write to the file
			String write = "Hello";
			
			write += " Thanks";
			
			myWriter.println(write);
			
		}
		

		myWriter.close();
		
		String line;
		
		int count = 0; // counter to check read lines.
		
		while (count < 5) {
			line = myReader.readLine();
			System.out.println(line);
			count++;
		}
		
		
		myReader.close();

	}

}
