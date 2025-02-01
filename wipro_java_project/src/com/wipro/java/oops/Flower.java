/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Flower {

	/**
	 * 
	 */
	//Properties
	String nameValue;
	String colorValue;
	int noOfVariantsValue;
	String familyValue;
		
//Constructor

	public Flower(String nameValue, String colorValue, int variantsValue, String familyValue) {
		super();
		this.nameValue = nameValue;
		this.colorValue = colorValue;
		this.noOfVariantsValue = variantsValue;
		this.familyValue = familyValue;
	}
	//Function to display
	public void display() {
		System.out.println("Name: "+nameValue+" Color: "+colorValue+" NoOfVariants: "+noOfVariantsValue+" Family: "+familyValue);
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation
		Flower flowerobj1=new Flower("Rose","Red",100,"flower");
		Flower flowerobj2=new Flower("Lilli","WHite",50,"flower");
		//method calling
		flowerobj1.display();
		flowerobj2.display();

	}

}
