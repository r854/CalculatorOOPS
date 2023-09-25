package CalculatorApp;

import java.math.BigInteger;

public class Factorial implements IUnaryCalculation {

    private Object a = null;
    private char operator = '!';
    private Object result = null;

    Factorial(Object a) {
        // Check if a is a String and try to convert it to BigInteger
        if (a instanceof String) {
            try {
                this.a = new BigInteger((String) a);
            } catch (NumberFormatException e) {
                // Handle invalid input (e.g., non-numeric String)
                this.a = null;
            }
        } else if (a instanceof BigInteger) {
            this.a = a;
        } else {
            // Handle invalid input (e.g., non-String, non-BigInteger)
            this.a = null;
        }
    }

    @Override
    public Object getFirstOperand() {
        return a;
    }

    @Override
    public Object getOperator() {
        return operator;
    }

    @Override
    public Object getResult() {
        return result;
    }

    @Override
    public void calculate() {
        if (a instanceof BigInteger) {
            result = calculateFactorial((BigInteger) a);
        } else {
            // Handle invalid input
            result = null;
        }
    }

    // Helper method to calculate the factorial of a BigInteger
    private BigInteger calculateFactorial(BigInteger num) {
        if (num.compareTo(BigInteger.ZERO) < 0) {
            // Factorial is not defined for negative numbers
            return null;
        }

        BigInteger factorial = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(num) <= 0; i = i.add(BigInteger.ONE)) {
            factorial = factorial.multiply(i);
        }
        return factorial;
    }
}
