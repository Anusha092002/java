/**
 * 
 */
package com.wipro.java.collections;

/**
 * 
 */
import java.util.*;
import java.util.Collections;

class NameComparator implements Comparator<Movies> {
    @Override
    public int compare(Movies m1, Movies m2) {
        return m1.getName().compareTo(m2.getName()); // Compare based on name
    }
    public static void main(String[] args) {
        // Create a list of Movies POJOs
        List<Movies> movieList = new ArrayList<>();
        movieList.add(new Movies("Inception", 8.8, 2010));
        movieList.add(new Movies("The Dark Knight", 9.0, 2008));
        movieList.add(new Movies("Interstellar", 8.6, 2014));
        movieList.add(new Movies("The Matrix", 8.7, 1999));

        
        // Sort the movies by rating using Comparable
        Collections.sort(movieList, new NameComparator());

        // Print sorted list of movies
        for (Movies movie : movieList) {
            System.out.println(movie);
        }
    }
}

