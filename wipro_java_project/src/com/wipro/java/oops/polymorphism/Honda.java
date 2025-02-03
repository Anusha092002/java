/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Honda extends Car{
	// same method but different implementation
	public void showSpeed() {
    	System.out.println("Speed of Honda: "+getSpeed());
}
	public static void main(String a[]) {
		Car car1=new Honda();// creating honda object with parent class reference
		car1.setSpeed(120f);// setting speed value=120f
		car1.showSpeed();// polymorphism
	}

}
