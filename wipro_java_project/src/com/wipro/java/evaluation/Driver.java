/**
 * 
 */
package com.wipro.java.evaluation;

/**
 * This Driver class to Demonstrate Polymorphism
 */
public class Driver {
	public static void main(String a[]) {
		Bank b1=new SBI(2000f);
		// This is Demonstrating Dynamic Polymorphism
		b1.rateOfInterest();
		// This is Demonstration for Method Overloading
		SBI s1=new SBI(2000f);
		s1.deposit(200f);
		s1.deposit(2000, "Savings");
		
	}

}
