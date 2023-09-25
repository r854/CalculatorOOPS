package CalculatorApp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class TakeInput {
	public Object [] arr = new Object[2];
	
	public Object[] input2args() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		
		String num1 = sc.nextLine();
		System.out.println("Enter second number: ");
		
		String num2 = sc.nextLine();
		
		Object a=null,b = null;
		//identify the type of number entered by user and convert it to that type
		try {
            if (num1.contains(".")) {
                // If the input contains a dot (.), it's likely a floating-point number
                a = new BigDecimal(num1);
            } else {
                // Otherwise, it's likely an integer
                a = new BigInteger(num1);
            }
        } catch (NumberFormatException e) {
            // If parsing as an integer or double fails, it's not a valid number
            System.out.println("Invalid input. Please enter a valid number.");
        }
		
		try {
            if (num2.contains(".")) {
                // If the input contains a dot (.), it's likely a floating-point number
                b = a = new BigDecimal(num2);
            } else {
                // Otherwise, it's likely an integer
                b = new BigInteger(num2);
            }
        } catch (NumberFormatException e) {
            // If parsing as an integer or double fails, it's not a valid number
            System.out.println("Invalid input. Please enter a valid number.");
        }
		arr[0]=a;
		arr[1]=b;
		//export the data then
		return arr;
		
	}
	
	public Object input1arg() {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		Object obj =  sc.nextLine();
		return obj;
		
	}
}
