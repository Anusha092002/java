/**
 * 
 */
package com.wipro.java.collections;

import java.util.List;
import java.util.ArrayList;

/**
 *ArrayList is an dynamic and resizable array implementation
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	
		// TODO Auto-generated method stub
		public static void main(String a[]) {
	        
	        List<Integer> l1 = new ArrayList<>();
	        l1.add(10);
	        l1.add(20);
	        l1.add(30);
	        System.out.println("List 1: " + l1);

	        List<Integer> l2 = new ArrayList<>();
	        l2.add(100);
	        l2.add(200);

	        // Step 2: Add all elements of l2 to l1 at index 1
	        l1.addAll(1, l2);
	        System.out.println("After addAll(1, l2): " + l1);

	        
	        l1.remove(1);
	        System.out.println("After remove(1): " + l1);

	        
	        l1.set(0, 5);
	        System.out.println("After set(0, 5): " + l1);
	    }

	

}
