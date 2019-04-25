import java.util.Scanner;

public class assign1 {

	public static void main(String[] args) {
		
		Scanner keys = new Scanner(System.in);
		
		
		System.out.println("Enter a sentence");
		String sentence = keys.nextLine();
		
		keys.close();
		
		String fisrtWord = sentence.substring(0, sentence.indexOf(" "));
		
		System.out.println(fisrtWord);
		
	}

}
