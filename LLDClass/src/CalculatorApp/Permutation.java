package CalculatorApp;

import java.math.BigInteger;

public class Permutation implements IBinaryCalculation {

	public Object n=null ,r=null,operator='P',result=null;
	
	Permutation(Object n,Object r){
		this.n = n;
		this.r = r;
	}
	@Override
	public Object getFirstOperand() {
		// TODO Auto-generated method stub
		return n;
	}

	@Override
	public Object getSecondOperand() {
		// TODO Auto-generated method stub
		return r;
	}

	@Override
	public Object getOperator() {
		// TODO Auto-generated method stub
		return operator;
	}

	@Override
	public Object getResult() {
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
	    // Calculate nPr
        result = calculateNPr(n, r);
    }

    // Calculate nPr using BigInteger
    public static BigInteger calculateNPr(Object n2, Object r2) {
        // Ensure n >= r
        if (((BigInteger) n2).compareTo((BigInteger) r2) < 0) {
            throw new IllegalArgumentException("n must be greater than or equal to r");
        }
        
        Factorial f; 
        

        // Calculate n!
        f = new Factorial(n2);
        f.calculate();
        BigInteger nFactorial = (BigInteger) f.getResult();

        // Calculate (n - r)!
        f = new Factorial(((BigInteger) n2).subtract((BigInteger) r2));
        f.calculate();
        BigInteger nMinusRFactorial = (BigInteger) f.getResult();

        // Calculate nPr = n! / (n - r)!
        return nFactorial.divide(nMinusRFactorial);
    }
}


