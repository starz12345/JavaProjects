
public class test {

	public static void main(String[] args) {
		
		int i = 15;
		
		i--;
		System.out.println(i);
		
		i+=12;
				
		System.out.println(i);		
		System.out.println(--i);
		System.out.println(i--);
		System.out.println(i);
		
		double discount;
		char code = 'C';
		
		switch (code) {
		case 'A':
			discount = 0.0;
		case 'B':
			discount = 0.1;
		case 'C':
			discount = 0.2;
		default:
			discount = 0.3;
		}
		// TODO Auto-generated method stub

	}

}
