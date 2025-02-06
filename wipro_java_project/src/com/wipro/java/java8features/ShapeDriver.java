package com.wipro.java.java8features;

public class ShapeDriver {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Display information using the default display method
        circle.display();
        rectangle.display();

        // Calculate area using the abstract area method
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());

        // Calculate perimeter using the default perimeter method
        System.out.println("Circle Perimeter: " + circle.perimeter());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        // Use static method to print general shape info
        Shape.printShapeInfo();
    }
}

