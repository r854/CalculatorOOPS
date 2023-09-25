package CalculatorApp;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Add implements IBinaryCalculation{
	public Object a=null ,b=null,operator='+',result=null;
	
	Add(Object a,Object b){
		this.a = a;
		this.b = b;
	}
	@Override
	public Object getFirstOperand() {
		return a;
	}
	
	@Override
	public Object getSecondOperand() {
		return b;
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
	    if (a instanceof BigDecimal && b instanceof BigDecimal) {
	        // Cast the objects to BigDecimal and perform addition
	        result = ((BigDecimal) a).add((BigDecimal) b);
	    } else if (a instanceof BigInteger && b instanceof BigInteger) {
	        // Cast the objects to BigInteger and perform addition
	        result = new BigDecimal((BigInteger) a).add(new BigDecimal((BigInteger) b));
	    } else {
	        // Handle incompatible types gracefully, e.g., throw an exception or set result to null
	        throw new IllegalArgumentException("Incompatible types for addition");
	    }
	}


}
