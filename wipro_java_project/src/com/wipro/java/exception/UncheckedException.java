/**
 * 
 */
package com.wipro.java.exception;

/**
 * UnChecked Exception is compiler doesn't know about the exception and interrupt the program and causes execution stopped. 
 */
public class UncheckedException {
    public static void main(String[] args) {
        try {
            String str = "abc"; // Invalid number format
            int number = Integer.parseInt(str);  // This will cause NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
            System.out.println(e.toString());
        }
    }
}

