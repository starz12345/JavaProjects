

public class SimpleCalculator {
	
	private double firstNumber;
	private double secondNumber;
	
	public double getFirstNumber() {
		return firstNumber;
	}
	
	public double getSecondNumber() {
		return secondNumber;
	}
	
	public void setFirstNumber(double number) {
		this.firstNumber = number;
	}
	
	public void setSecondNumber(double number) {
		this.secondNumber = number;
	}
	
	public double getAdditionResult() {
		
		double sum = this.firstNumber + this.secondNumber;
		
		return sum;
	}
	
	public double getSubtractionResult() {
		
		double diff = this.firstNumber - this.secondNumber;
		
		return diff;
	}
	
	public double getMultiplicationResult() {
		
		double mult = this.firstNumber * this.secondNumber;
		
		return mult;
	}
	
	public double getDivisionResult() {
		
		if(this.secondNumber == 0){
            return 0;
        }
		
		double div = this.firstNumber / this.secondNumber;
		
		return div;
	}
	
	
}
