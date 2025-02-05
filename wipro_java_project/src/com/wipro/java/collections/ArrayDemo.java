/**
 * 
 */
package com.wipro.java.collections;

import java.util.Scanner;

/**
 * Array is a collection of homogeneous elements
 */
public class ArrayDemo {

	/**
	 * @param args
	 */
	
	    public static void main(String[] args) {
	        // Step 1: Declare and initialize an array
	    	//for Integer Type
	        int[] userNums = {2, 4, 6, 8, 10}; // Declaration as well as Initialization
	        //Printing Arrays
	        System.out.println("Printing Integer Array:");
	        for (int i = 0; i < userNums.length; i++) {
	            System.out.print((userNums[i] ) + " ");
	        }
	        // for Char type
            char[] charArray= new char[5]; // By using new Keyword only Declaration Initialization by hard coding
            charArray[0]='a';
            charArray[1]='b';
            charArray[2]='c';
            charArray[3]='d';
            charArray[4]='e';
            //Printing Char Array
            System.out.println("\nPrinting Char Array:");
	        for (int i = 0; i < charArray.length; i++) {
	            System.out.print((charArray[i] ) + " ");
	        }
            // for Float type
            float[] floatArray= new float[5];
            // User Input By using Scanner class 
            Scanner scanner = new Scanner(System.in);

            // Step 1: Get array size from the user
            System.out.print("\nEnter the number of elements\n");
           
          // Read array elements from the user
            
            for (int i = 0; i < 5; i++) {
            	System.out.println("Enter element"+(i+1)+":");
            	floatArray[i] = scanner.nextFloat();
            }
        
	        System.out.println("\nPrinting Float Array");
	        for (int i = 0; i < floatArray.length; i++) {
	            System.out.print((floatArray[i] ) + " ");
	        }
	    }
	

}
