/**
 * 
 */
package com.wipro.java.exception;

/**
 * Demonstrating basic example of Exception
 */
public class DemoException {
    public static void division() {
        int num1 = 30, num2 = 0;
        try {
            System.out.println("Division: " + num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Zero Division is not Possible....");
            System.out.println(e.toString());
        }
    }

    public static void main(String a[]) {
        try {
            division(); // Handle ArithmeticException separately
            int array[] = new int[5];
            array[6] = 1; // Now this will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You Exceeded the Index Please Ensure it....");
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Finally Block...");
        }
    }
}
