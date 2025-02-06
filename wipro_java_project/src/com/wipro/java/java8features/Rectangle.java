/**
 * 
 */
package com.wipro.java.java8features;

/**
 * 
 */
public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    // Override default perimeter method
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    // Override default display method to display Rectangle-specific info
    @Override
    public void display() {
        System.out.println("This is a Rectangle.");
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

