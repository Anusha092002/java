/**
 * 
 */
package com.wipro.java.oops.encapsulation;

/**
 * 
 */
public class AnimalEnc {

	/**
	 * Animal Properties..
	 */
	private String animalName;// This is Animal Name
	private String animalColor;// This is Animal Color
	private String animalType;// This is Animal Type
	private float animalSize;// This is Animal Size
	

	/**
	 * @return the animalName
	 */
	public String getAnimalName() {
		return animalName;
	}


	/**
	 * @param animalName the animalName to set
	 */
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}


	/**
	 * @return the animalColor
	 */
	public String getAnimalColor() {
		return animalColor;
	}


	/**
	 * @param animalColor the animalColor to set
	 */
	public void setAnimalColor(String animalColor) {
		this.animalColor = animalColor;
	}


	/**
	 * @return the animalType
	 */
	public String getAnimalType() {
		return animalType;
	}


	/**
	 * @param animalType the animalType to set
	 */
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}


	/**
	 * @return the animalSize
	 */
	public float getAnimalSize() {
		return animalSize;
	}


	/**
	 * @param animalSize the animalSize to set
	 */
	public void setAnimalSize(float animalSize) {
		if(0<animalSize) {
			this.animalSize = animalSize;
		}
		else {
			System.out.println("There is Animal SIze below Zero");
			
		}
	}

    // Constructor..
	public AnimalEnc(String animalName, String animalColor, String animalType, float animalSize) {
		super();
		this.animalName = animalName;
		this.animalColor = animalColor;
		this.animalType = animalType;
		this.animalSize = animalSize;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Using Constructor
		AnimalEnc a1=new AnimalEnc("Lion","Yellow","Animal",500f);
		System.out.println(a1.getAnimalName());
		System.out.println(a1.animalColor);
		System.out.println(a1.animalType);
		System.out.println(a1.animalSize);
		// Using setter method 
		a1.setAnimalColor("Brown");
		System.out.println(a1.animalColor);
		//Assigning Negative value to check condition
		a1.setAnimalSize(-10);
		
		

	}

}
