package CalculatorApp;

import java.util.ArrayList;

public class UserInterface implements IUserInterface {
	
	@Override
	public void displayMenu() {
		// TODO Auto-generated method stub
		
		System.out.println("+=====================================================+");
		System.out.println("+                          Main Menu                  +");
		System.out.println("+-----------------------------------------------------+");
		System.out.println("+      1.Addition                    8.Factorial      +");
		System.out.println("+      2.Substraction                9.Permutation    +");
		System.out.println("+      3.Multiplication             10.Combination    +");
		System.out.println("+      4.Division                   11.Show History   +");
		System.out.println("+      5.Modulus                    12.Delete History +");
		System.out.println("+      6.Power                      13.Exit           +");
		System.out.println("+      7.Absolute Difference                          +");
		System.out.println("+=====================================================+");
		
		System.out.println("Enter your choice?");

	}

	@Override
	public void printOutput(IBinaryCalculation obj) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println(obj.getFirstOperand()+" "+obj.getOperator()+" "+obj.getSecondOperand()+" = "+obj.getResult());
	}
	
	public void printOutput(IUnaryCalculation obj) {
		System.out.println(obj.getFirstOperand()+" "+obj.getOperator()+" = "+obj.getResult());
	}
}
