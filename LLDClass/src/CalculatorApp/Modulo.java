package CalculatorApp;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Modulo implements IBinaryCalculation {
	
	Object a =null,b=null,operator="MOD",result=null;
	Modulo(Object a,Object b){
		this.a = a;
		this.b = b;
	}
	public Object getFirstOperand() {
		return a;
	}

	@Override
	public Object getSecondOperand() {
		return b;
	}

	@Override
	public Object getResult() {
		return result;
	}
	
	@Override
	public Object getOperator() {
		return operator;
	}

	@Override
	public void calculate() {
		if (a instanceof BigInteger && b instanceof BigInteger) {
            // Cast the objects to Integer and perform addition
			 result = ((BigInteger) a).mod((BigInteger) b);
        }
		else {
			BigDecimal bdA = (a instanceof BigDecimal) ? (BigDecimal) a : new BigDecimal(a.toString());
	        BigDecimal bdB = (b instanceof BigDecimal) ? (BigDecimal) b : new BigDecimal(b.toString());
	        result = bdA.remainder(bdB);
		}
	}	

}
