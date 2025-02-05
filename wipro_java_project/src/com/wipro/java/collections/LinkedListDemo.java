/**
 * 
 */
package com.wipro.java.collections;

import java.util.LinkedList;

/**
 * 
 */
public class LinkedListDemo {
	  public static void main(String[] args) {
	       
	        LinkedList<Integer> list = new LinkedList<>();

	        //  Add elements to the LinkedList
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        System.out.println("After adding elements:");
	        printList(list);// calling printList method
	        // adding an element at index 1
	        list.add(1, 15);
	        System.out.println("After add(1, 15):");
	        printList(list);// calling printList method

	        // Remove an element by index
	        list.remove(2);
	        System.out.println("After remove(2):");
	        printList(list);// calling printList method

	        // Update an element using set()
	        list.set(0, 5);
	        System.out.println("After set(0, 5):");
	        printList(list);// calling printList method
	    }

	    // Method to print LinkedList using a for loop
	    public static void printList(LinkedList<Integer> list) {
	        System.out.print("LinkedList: ");
	        for (int num : list) {
	            System.out.print(num + " ");
	        }
	        System.out.println(); // Newline for better readability
	    }

}
