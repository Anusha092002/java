/**
 * 
 */
package com.wipro.java.oops.interfacedemo;

/**
 * 
 */
public class Dog implements IAnimal {

	/**
	 * @param args
	 */
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Dog is making sound bow....");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAnimal dog=new Dog();

	}

	

}
