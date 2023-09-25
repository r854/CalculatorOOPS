package CalculatorApp;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Power implements IBinaryCalculation{

public Object a=null ,b=null,operator='^',result=null;
	
	Power(Object a,Object b){
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
            // Cast the objects to Integer and perform addition
			result = ((BigInteger) a).pow(((BigInteger) b).intValue());
        }
		else {
			BigDecimal bdA = (a instanceof BigDecimal) ? (BigDecimal) a : new BigDecimal(a.toString());
	        BigDecimal bdB = (b instanceof BigDecimal) ? (BigDecimal) b : new BigDecimal(b.toString());
	        result = bdA.pow(bdB.intValue());
		}
	}	
}
