/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Honda extends Car{
	public void showSpeed() {
    	System.out.println("Speed of Honda: "+getSpeed());
}
	public static void main(String a[]) {
		Car car1=new Honda();
		car1.setSpeed(120f);
		car1.showSpeed();
	}

}
