package CalculatorApp;


public interface IBinaryCalculation {
	public Object getFirstOperand();
	public Object getSecondOperand();
	public Object getOperator();
	public Object getResult();
	public void calculate();
}
