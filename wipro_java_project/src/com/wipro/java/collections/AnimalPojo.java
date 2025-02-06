/**
 * 
 */
package com.wipro.java.collections;

/**
 * 
 */
public class AnimalPojo {
	private String name;
	private Double weight;
	private int legsCount;
	
	public AnimalPojo(String name, Double weight, int legsCount) {
		this.name = name;
		this.weight = weight;
		this.legsCount = legsCount;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the weight
	 */
	public Double getWeight() {
		return weight;
	}
	/**
	 * @return the legsCount
	 */
	public int getLegsCount() {
		return legsCount;
	}
	@Override
	public String toString() {
		return "name=" + name + ", weight=" + weight + ", legsCount=" + legsCount ;
	}
	

}
