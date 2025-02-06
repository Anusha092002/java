/**
 * 
 */
package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 */

public class AnimalWeightComparator implements Comparator<AnimalPojo> {
	@Override
    public int compare(AnimalPojo a1, AnimalPojo a2) {
		return Double.compare(a1.getWeight(), a2.getWeight()); // Compare based on name
    }
    public static void main(String[] args) {
        // Create a list of Movies POJOs
    	List<AnimalPojo> animalList=new ArrayList<>();
		animalList.add(new AnimalPojo("Pigeon",50.8,2));
		animalList.add(new AnimalPojo("Fish",20.8,0));
		animalList.add(new AnimalPojo("Lion",100.8,4));

        
        // Sort the movies by rating using Comparable
        Collections.sort(animalList, new AnimalWeightComparator());

        // Print sorted list of movies
        for (AnimalPojo animal : animalList) {
            System.out.println(animal);
        }
    }
}
