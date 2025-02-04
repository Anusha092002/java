/**
 * 
 */
package com.wipro.java.exception;

/**
 * Checked Exception is exception that compiler suggests that there may be chance of occurring of an Exception
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class CheckedException {

    public static void main(String[] args) {
    	try {
            // Trying to open a file that doesn't exist
            FileReader fileReader = new FileReader(new File("nonexistentfile.txt")); // This can throw FileNotFoundException
            fileReader.read();
            fileReader.close();
        } catch (FileNotFoundException e) {
            // Handle FileNotFoundException
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other general exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

