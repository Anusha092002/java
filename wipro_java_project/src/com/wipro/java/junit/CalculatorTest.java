/**
 * 
 */
package com.wipro.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */
public class CalculatorTest {
	private final Calculator calculator= new Calculator();
	@Test
	public void testAdd() {
		int result=calculator.add(3, 5);
		assertEquals(8,result);
	}
	@Test
	public void testSubtract() {
		int result=calculator.subtract(5, 3);
		assertEquals(2,result);
	}
	@Test
	public void testAddNegative() {
		int result=calculator.add(-3, -5);
		assertEquals(-8,result);
	}
	@Test
	public void testSubtractNegative() {
		int result=calculator.subtract(-3, -5);
		assertEquals(2,result);
	}

}
