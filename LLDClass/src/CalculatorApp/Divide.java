package CalculatorApp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Divide implements IBinaryCalculation{

public Object a=null ,b=null,operator='/',result=null;
	
	Divide(Object a,Object b){
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
	        // Cast the objects to BigDecimal and perform division
	        result = new BigDecimal((BigInteger) a).divide(new BigDecimal((BigInteger) b), 2, RoundingMode.HALF_UP);
	    } else if ((a instanceof BigInteger && b instanceof BigDecimal)
	            || (a instanceof BigDecimal && b instanceof BigInteger)
	            || (a instanceof BigDecimal && b instanceof BigDecimal)) {
	        // Cast the objects to BigDecimal and perform division with scale and rounding mode
	        result = ((BigDecimal) a).divide((BigDecimal) b, 2, RoundingMode.HALF_UP);
	    } else if (a instanceof Integer && b instanceof Integer) {
	        // If both operands are integers, cast them to BigDecimal for fractional division
	        result = new BigDecimal((Integer) a).divide(new BigDecimal((Integer) b), 2, RoundingMode.HALF_UP);
	    }
	}


}
