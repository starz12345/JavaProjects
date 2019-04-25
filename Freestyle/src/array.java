import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		
		
		
		char[] arr = {'a', 'c', 'd'};
		char[] arr1 = {'a', 'c', 'd'};
		Arrays.sort(arr);
		boolean test =false;
		
		//System.out.println(!test);
		
		B b = new B();
		
		System.out.println(b instanceof B);
		System.out.println(b instanceof A);
		System.out.println(b instanceof C);
		
		int x = 3 & 5;
		int y = 3 | 5;
		
		System.out.println(x + "," + y);
		
		class Inner{
			
			final Integer i6 = 6;
			Integer i7 = 7;
			
			Inner() {
				// TODO Auto-generated constructor stub
				System.out.println(i6 + i7);
			}
		}
		
		

	}

}

class A{
	public int test;
}
class B extends A{
	public int test;
}
class C extends B{}
