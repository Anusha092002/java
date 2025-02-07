/**
 * 
 */
package com.wipro.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * In class Demonstrating Junit to test piece of code
 */
public class CalculatorTest {
	private final Calculator calculator= new Calculator();
	// Testing Addition of Two Numbers
	@Test
	public void testAdd() {
		int result=calculator.add(3, 5);
		assertEquals(8,result);
	}
	// Testing Subtraction of Two Numbers
	@Test
	public void testSubtract() {
		int result=calculator.subtract(5, 3);
		assertEquals(2,result);
	}
	// Testing Addition of Two Negative Numbers
	@Test
	public void testAddNegative() {
		int result=calculator.add(-3, -5);
		assertEquals(-8,result);
	}
	// Testing Subtraction of Two Negative Numbers
	@Test
	public void testSubtractNegative() {
		int result=calculator.subtract(-3, -5);
		assertEquals(2,result);
	}

}
