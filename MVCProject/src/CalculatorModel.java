
public class CalculatorModel {
	
	private int calculationValue;
	
	//Serves as the Model, handling the actual calculation of data
	//Provides access to the data
	public void addTwoNumbers(int firstNumber, int secondNumber) {
		
		calculationValue = firstNumber + secondNumber;
	}
	
	public int getCalculationValue(){
		return calculationValue;
	}

}
