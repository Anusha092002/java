/**
 * 
 */
package com.wipro.java.collections;

/**
 * Java Program to Demonstrate the use Comparable Interface to sort
 */
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Movies implements Comparable<Movies> {
    private String name;
    private double rating;
    private int year;

    // Constructor
    public Movies(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }


    public double getRating() {
        return rating;
    }

    
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie: " + name + ", Rating: " + rating + ", Year: " + year;
    }

    // Implement compareTo to compare movies by rating
    @Override
    public int compareTo(Movies other) {
        return Double.compare(this.rating, other.rating);
    }

    public static void main(String[] args) {
        // Create a list of movies
        List<Movies> movieList = new ArrayList<>();
        movieList.add(new Movies("Inception", 8.8, 2010));
        movieList.add(new Movies("The Dark Knight", 9.0, 2008));
        movieList.add(new Movies("Interstellar", 8.6, 2014));
        movieList.add(new Movies("The Matrix", 8.7, 1999));

        // Sort the movies by rating using Comparable (compareTo)
        Collections.sort(movieList);

        // Print sorted list of movies
        for (Movies movie : movieList) {
            System.out.println(movie);
        }
    }
}

