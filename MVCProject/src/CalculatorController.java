import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addCalculateListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			
			//In case proper numbers are not entered, try block is used:
			try{
			
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				//Has the model perform the calculation
				theModel.addTwoNumbers(firstNumber, secondNumber);
				//has the view display the solution, which is stored in the model
				theView.setCalcSolution(theModel.getCalculationValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
		
	}
	
}

