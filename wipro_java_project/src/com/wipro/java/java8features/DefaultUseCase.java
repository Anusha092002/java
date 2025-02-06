/**
 * 
 */
package com.wipro.java.java8features;

/**
 * This DefaultUseCase Demonstrating how to call if two interfaces have same default method
 */
interface TestInterFace1{
	default void read() {
		System.out.println("Here we Reading TestInterFace1 ");
	}
}
interface TestInterFace2{
	default void read() {
		System.out.println("Here we Reading TestInterFace2 ");
	}
}


public class DefaultUseCase implements TestInterFace1,TestInterFace2 {
	public void read() {
	 // Here we calling TestInterFace1 read() method
	 TestInterFace1.super.read();
	// Here we calling TestInterFace2 read() method
	 TestInterFace2.super.read();
    }
	public static void main(String a[]) {
		DefaultUseCase defaultUseCase=new DefaultUseCase();
		defaultUseCase.read();
	}
 
}
