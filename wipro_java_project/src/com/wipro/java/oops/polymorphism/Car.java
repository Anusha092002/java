/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Car {
	private float speed;

	/**
	 * @return the speed
	 */
	public float getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(float speed) {
		this.speed = speed;
	}
    public void showSpeed() {
    	System.out.println("Speed of Car"+getSpeed());
}
}
