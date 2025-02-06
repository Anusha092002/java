/**
 * 
 */
package com.wipro.java.java8features;

/**
 * 
 */
@FunctionalInterface
public interface Shape {
    // Abstract method
    double area();

    // Default method 1: to get the perimeter
    default double perimeter() {
        return 0.0;  // Default implementation, can be overridden
    }

    // Default method 2: to display the shape details
    default void display() {
        System.out.println("This is a shape.");
    }

    // Static method 1: to get the total number of shapes created
    static int totalShapes() {
        return 0;  // Placeholder for static shapes counter, can be updated
    }

    // Static method 2: to print a general description of shapes
    static void printShapeInfo() {
        System.out.println("Shapes are geometric figures with various properties.");
    }
}

