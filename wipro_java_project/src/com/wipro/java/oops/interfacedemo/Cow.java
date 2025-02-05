/**
 * 
 */
package com.wipro.java.oops.interfacedemo;

/**
 * 
 */
public class Cow implements IAnimal {

	/**
	 * @param args
	 */
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Cow making sound humba....");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAnimal cow=new Cow();
		cow.makeSound();

	}

	

}
