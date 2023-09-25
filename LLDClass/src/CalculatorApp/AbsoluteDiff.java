package CalculatorApp;

import java.math.BigDecimal;
import java.math.BigInteger;

public class AbsoluteDiff implements IBinaryCalculation {

	public Object a=null ,b=null,operator="absolute diff",result=null;
	AbsoluteDiff(Object a,Object b){
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
		if (a instanceof BigInteger && b instanceof BigInteger) {
            // Cast the objects to Integer and perform addition
			
			 result = (((BigInteger) a).abs().subtract(((BigInteger) b).abs()));
        }
		else if((a instanceof BigInteger && b instanceof BigDecimal)
				||(a instanceof BigDecimal && b instanceof BigInteger) 
				||(a instanceof BigDecimal && b instanceof BigDecimal)
				){
			result = (((BigDecimal) a).abs().subtract(((BigDecimal) b).abs()));
		}
	}	

}
