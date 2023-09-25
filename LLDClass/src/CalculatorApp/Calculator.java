package CalculatorApp;

import java.util.Scanner;

public class Calculator {
	public static void main(String [] args) {
		int choice;
		
		IBinaryCalculation calc;
		IUnaryCalculation calc1;
		TakeInput inp;
		IUserInterface sv = new UserInterface();
		
		ISaveCalculation history = new CalculationDAO();
		Object[]arr;
		
		while(true) {
			
			sv.displayMenu();
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			switch(choice) {
				case 1://Add
					inp = new TakeInput();
					arr = inp.input2args();
					calc = new Add(arr[0],arr[1]);
					calc.calculate();
					sv.printOutput(calc);
					history.save(calc);
					break;
				case 2://Subtract
					inp = new TakeInput();
					arr = inp.input2args();
					calc = new Substract(arr[0],arr[1]);
					calc.calculate();
					sv.printOutput(calc);
					history.save(calc);
					break;
				case 3://Multiply
					inp = new TakeInput();
					arr = inp.input2args();
					calc = new Multiply(arr[0],arr[1]);
					calc.calculate();
					sv.printOutput(calc);
					history.save(calc);
					break;
				case 4://Divide
					inp = new TakeInput();
					arr = inp.input2args();
					calc = new Divide(arr[0],arr[1]);
					calc.calculate();
					sv.printOutput(calc);
					history.save(calc);
					break;
				case 5://Modulus
					inp = new TakeInput();
					arr = inp.input2args();
					calc = new Modulo(arr[0],arr[1]);
					calc.calculate();
					sv.printOutput(calc);
					history.save(calc);
					break;
				case 6://Exponentiation
					inp = new TakeInput();
					arr = inp.input2args();
					calc = new Power(arr[0],arr[1]);
					calc.calculate();
					sv.printOutput(calc);
					history.save(calc);
					break;
				case 7://Absolute Difference
					inp = new TakeInput();
					arr = inp.input2args();
					calc = new AbsoluteDiff(arr[0],arr[1]);
					calc.calculate();
					sv.printOutput(calc);
					history.save(calc);
					break;
					
				case 8://Factorial
					inp = new TakeInput();
					Object val= inp.input1arg();
					calc1 = new Factorial(val);
					calc1.calculate();
					sv.printOutput(calc1);
					history.save(calc1);
					break;
				case 9://Permutation
					inp = new TakeInput();
					arr = inp.input2args();
					calc = new Permutation(arr[0],arr[1]);
					calc.calculate();
					sv.printOutput(calc);
					history.save(calc);
					break;
					
				case 10://Combination
					inp = new TakeInput();
					arr = inp.input2args();
					calc = new Combination(arr[0],arr[1]);
					calc.calculate();
					sv.printOutput(calc);
					history.save(calc);
					break;
				case 11:
					history.show();
					break;
				case 12:
					history.delete();
					break;
				case 13:
					System.exit(0);
				default:
			}
		}
	}
}