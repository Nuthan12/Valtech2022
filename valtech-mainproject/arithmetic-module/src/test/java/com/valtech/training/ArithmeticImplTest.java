package com.valtech.training;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ArithmeticImplTest {
	
	ArithmeticImpl a =new ArithmeticImpl() ;
		

	@Test
	public void testAdd() {
		assertEquals(10,a.add(5, 5));
		assertEquals(15,a.add(10, 5));
		assertEquals(0,a.add(0, 0));
		assertEquals(20,a.add(10, 10));
		assertEquals(40,a.add(25, 15));
		assertEquals(60,a.add(30, 30));
		
	}
	
	@Test
	public void testSub() {
		assertEquals(2, a.sub(5, 3));
		assertEquals(12, a.sub(24, 12));
		assertEquals(15, a.sub(30, 15));
		assertEquals(40, a.sub(50, 10));
		assertEquals(25, a.sub(50, 25));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(10, a.mul(5, 2));
		assertEquals(120, a.mul(12, 10));
		assertEquals(16, a.mul(8,2));
		assertEquals(30, a.mul(15, 2));
		assertEquals(50, a.mul(5, 10));
	}

	@Test 
	public void testDivide() {
		assertEquals(2, a.div(10, 5));
		assertEquals(6, a.div(36, 6));
		assertEquals(5, a.div(75, 15));
		assertEquals(8, a.div(56, 7));
		assertEquals(130, a.div(1300, 10));
		try {
			a.div(3, 0);
			fail("Arithmetic Exception was Expected when divided by zero");
		}
		catch(ArithmeticException e) {
			
		}
	}
}
