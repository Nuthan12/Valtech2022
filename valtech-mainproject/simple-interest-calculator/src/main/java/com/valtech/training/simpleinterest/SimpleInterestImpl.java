package com.valtech.training.simpleinterest;

import com.valtech.training.Arithmetic;
import com.valtech.training.ArithmeticImpl;

public class SimpleInterestImpl implements SimpleInterest {
	
	private Arithmetic a =new ArithmeticImpl();

	public int computeInterest(int p, int t, int r) {
		
		return (a.div(a.mul(p, a.mul(t, r)),100 )); 
	}
	
}
