package com.valtech.training.simpleinterest;

import org.junit.Test;

import junit.framework.TestCase;

public class SimpleInterestImplTest extends TestCase {
	
	SimpleInterest si=new SimpleInterestImpl();
		
		
	
	
	@Test
	public void testSimpleInterest(){
		assertEquals(12, si.computeInterest(600, 2, 1));
	}
}
