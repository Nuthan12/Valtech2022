package com.valtech.maven.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticImplTest {
	
	Arithmetic a=new ArithmeticImpl();
	
	
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
		assertEquals(2, a.subtract(5, 3));
		assertEquals(12, a.subtract(24, 12));
		assertEquals(15, a.subtract(30, 15));
		assertEquals(40, a.subtract(50, 10));
		assertEquals(25, a.subtract(50, 25));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(10, a.multiply(5, 2));
		assertEquals(120, a.multiply(12, 10));
		assertEquals(16, a.multiply(8,2));
		assertEquals(30, a.multiply(15, 2));
		assertEquals(50, a.multiply(5, 10));
	}

	@Test 
	public void testDivide() {
		assertEquals(2, a.divide(10, 5));
		assertEquals(6, a.divide(36, 6));
		assertEquals(5, a.divide(75, 15));
		assertEquals(8, a.divide(56, 7));
		assertEquals(130, a.divide(1300, 10));
		try {
			a.divide(3, 0);
			fail("Arithmetic Exception was Expected when divided by zero");-
		}
		catch(ArithmeticException e) {
			
		}
	}
}
