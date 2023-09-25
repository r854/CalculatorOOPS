package CalculatorApp;

public interface IUnaryCalculation {
	public Object getFirstOperand();
	public Object getOperator();
	public Object getResult();
	public void calculate();
}
