/*
* Model performs operations and stores data
* */
package design_patterns.ModelViewController;

public class CalculatorModel
{
	private int calculationValue;

	public void addTwoNumbers(int firstNum, int secondNum)
	{
		this.calculationValue =  firstNum + secondNum;
	}

	public int getCalculationValue()
	{
		return calculationValue;
	}
}
