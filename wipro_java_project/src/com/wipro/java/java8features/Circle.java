/**
 * 
 */
package com.wipro.java.java8features;

/**
 * Implementing Shape Functional Interface
 */
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Override default perimeter method
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Override default display method to display Circle-specific info
    @Override
    public void display() {
        System.out.println("This is a Circle.");
        System.out.println("Radius: " + radius);
    }
}

