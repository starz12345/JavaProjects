
public class testerrr {

	public static void main(String[] args) {
		
		String text;
		text = "Life is a flower";
		for (int i = 0; i < text.length(); i++ ) {
			System.out.print(text.charAt(i));
			System.out.print(text.indexOf(text.charAt(i)));
		}
		
		
		//System.out.println(text.substring(3, 6));
	}

}
