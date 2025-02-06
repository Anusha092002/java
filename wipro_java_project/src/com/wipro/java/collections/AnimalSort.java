/**
 * 
 */
package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 */
public class AnimalSort implements Comparable<AnimalSort> {
	

	/**
	 * @param args
	 */
	

	private AnimalPojo animal;

	/**
	 * @return the movie
	 */
	public AnimalPojo getAnimalPojo() {
		return animal;
	}
	public AnimalSort(AnimalPojo movie) {
		this.animal=movie;
	}

	@Override
    public int compareTo(AnimalSort other) {
        return  this.animal.getName().compareTo(other.animal.getName());
    }
	@Override
	public String toString() {
		return "Name: "+animal.getName()+" Weight: "+animal.getWeight()+" LegCount: "+animal.getLegsCount();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<AnimalPojo> animalList=new ArrayList<>();
		animalList.add(new AnimalPojo("Pigeon",50.8,2));
		animalList.add(new AnimalPojo("Fish",20.8,0));
		animalList.add(new AnimalPojo("Lion",100.8,4));
	    
	 // Convert Movies POJOs into MoviesComparable objects
        List<AnimalSort> comparableAnimal = new ArrayList<>();
        for (AnimalPojo animal : animalList) {
        	comparableAnimal.add(new AnimalSort(animal));
        }

        // Sort the movies by rating using Comparable
        Collections.sort(comparableAnimal);

        // Print sorted list of movies
        System.out.println("Printing Animal in Alpabatical Order");
        for (AnimalSort animalComparable : comparableAnimal) {
            System.out.println(animalComparable);
        }
    }


	}
	


