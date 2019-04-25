
public class calculator {

	public static void main(String[] args) {
		
		SimpleCalculator calculator = new SimpleCalculator();
		
		calculator.setFirstNumber(8.0);
		calculator.setSecondNumber(0.0);
		
		System.out.println(calculator.getAdditionResult());
		System.out.println(calculator.getDivisionResult());

	}

}
