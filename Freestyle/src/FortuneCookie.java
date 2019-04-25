import java.util.Random;

public class FortuneCookie {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int i = 1 + ran.nextInt(6);
		
		if (i == 1) System.out.println("Fortune cookie says: \"You will find happiness with a new love.\"");
		if (i == 2) System.out.println("Fortune cookie says: \"Stick with your wife.\"");
		if (i == 3) System.out.println("Fortune cookie says: \"Stick with your SideChick.\"");
		if (i == 4) System.out.println("Fortune cookie says: \"Stick with your ex.\"");
		if (i == 5) System.out.println("Fortune cookie says: \"Go home.\"");
		if (i == 6) System.out.println("Fortune cookie says: \"You will find lonliness with a new love.\"");
		
		
		
		System.out.print("        " + 1 + ran.nextInt(54));
		System.out.print(" - ");
		System.out.print(1 + ran.nextInt(54));
		System.out.print(" - ");
		System.out.print(1 + ran.nextInt(54));
		System.out.print(" - ");
		System.out.print(1 + ran.nextInt(54));
		System.out.print(" - ");
		System.out.print(1 + ran.nextInt(54));
		System.out.print(" - ");
		System.out.print(1 + ran.nextInt(54));
	}

}
