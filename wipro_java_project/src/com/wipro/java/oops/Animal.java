/**
 * 
 */
package com.wipro.java.oops;

/**NO constructor
* Getters have return value
* setters have no return value
* properties are determined using private fileds
* values are behaviors are determined through setters
* toString will convert the entire animal class with properties and behaviors
*/
public class Animal {

	/**
	 * Private Prioperties
	 */
	
	private String animal_name; // This is Animal Name
	private String animal_color;// This is Animal Color
	private String animal_family;// This is Animal Family(Animal,Bird,Acquatic)
	private String animal_type;// This is Animal Type(Carnivore,Scavenger)
	


	/**
	 * @return the animal_name
	 */
	public String getAnimal_name() {
		return animal_name;
	}

	/**
	 * @param animal_name the animal_name to set
	 */
	public void setAnimal_name(String animal_name) {
		this.animal_name = animal_name;
	}

	/**
	 * @return the animal_color
	 */
	public String getAnimal_color() {
		return animal_color;
	}

	/**
	 * @param animal_color the animal_color to set
	 */
	public void setAnimal_color(String animal_color) {
		this.animal_color = animal_color;
	}

	/**
	 * @return the animal_family
	 */
	public String getAnimal_family() {
		return animal_family;
	}

	/**
	 * @param animal_family the animal_family to set
	 */
	public void setAnimal_family(String animal_family) {
		this.animal_family = animal_family;
	}

	/**
	 * @return the animal_type
	 */
	public String getAnimal_type() {
		return animal_type;
	}

	/**
	 * @param animal_type the animal_type to set
	 */
	public void setAnimal_type(String animal_type) {
		this.animal_type = animal_type;
	}

	@Override
	public String toString() {
		return "Animal [animal_name=" + animal_name + ", animal_color=" + animal_color + ", animal_family="
				+ animal_family + ", animal_type=" + animal_type + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
