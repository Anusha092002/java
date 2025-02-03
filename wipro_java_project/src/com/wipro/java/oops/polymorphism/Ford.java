/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Ford extends Car {
	// Same method but different implementation
	public void showSpeed() {
    	System.out.println("Speed of Ford: "+getSpeed());
}
	public static void main(String a[]) {
		Car car2=new Ford(); // creating a object with parent class reference
		car2.setSpeed(130f);// setting speed value=130f
		car2.showSpeed();//polymorphism
	}

}
