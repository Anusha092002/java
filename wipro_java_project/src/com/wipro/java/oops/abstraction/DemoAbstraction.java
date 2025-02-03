/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * Demonstrating the Abstraction concept
 */
public class DemoAbstraction {
	public static void main(String a[]) {
		Car carobj1=new Suzuki();
		Car carobj2=new Ford();
		carobj1.paintColor();
		carobj2.paintColor();
		
	}

}
