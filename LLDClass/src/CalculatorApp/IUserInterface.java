package CalculatorApp;

import java.util.ArrayList;

public interface IUserInterface {
	public void displayMenu();
	public void printOutput(IBinaryCalculation obj);
	public void printOutput(IUnaryCalculation obj);
}
