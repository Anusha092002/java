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

public class Movies  {
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

    
}

