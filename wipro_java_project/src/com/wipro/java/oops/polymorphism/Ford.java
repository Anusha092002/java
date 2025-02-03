/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Ford extends Car {
	public void showSpeed() {
    	System.out.println("Speed of Ford: "+getSpeed());
}
	public static void main(String a[]) {
		Car car2=new Ford();
		car2.setSpeed(130f);
		car2.showSpeed();
	}

}
