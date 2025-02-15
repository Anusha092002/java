/**
 * 
 */
package com.wipro.java.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * 
 */
public class HashMapDemo {
	public static void main(String[] args) {

	    // create a hashmap
	    HashMap<String, Integer> languages = new HashMap<>();

	    // add elements to hashmap
	    languages.put("Java", 8);
	    languages.put("JavaScript", 1);
	    languages.put("Python", 3);
	    languages.put("Java", 12);
	    System.out.println("HashMap: " + languages);
	 // create another HashMap
	    HashMap<String, Integer> numbers = new HashMap<>();
	    numbers.put("One", 1);
	    numbers.put("Two", 22);
	 // Add all mappings from language to numbers
	    numbers.putAll(languages);
	    System.out.println("HashMap: " + languages);
	 // key already not present in HashMap
	    languages.putIfAbsent("oops",4 );

	    // key already present in HashMap
	    languages.putIfAbsent("java",2);
	    System.out.println("Updated Languages: " + languages);
	    // get() method to get value
	    int value = languages.get("Java");
	    System.out.println("Value at index 1: " + value);
	 // return set view of keys
	    // using keySet()
	    System.out.println("Keys: " + languages.keySet());

	    // return set view of values
	    // using values()
	    System.out.println("Values: " + languages.values());

	    // return set view of key/value pairs
	    // using entrySet()
	    System.out.println("Key/Value mappings: " + languages.entrySet());
	    System.out.println(languages.getOrDefault("Swift", 0));
	 // change element with key 2
	    languages.replace( "Python",2);
	    System.out.println("HashMap using replace(): " + languages);
	 // remove element associated with key 2
	    int value1 = languages.remove("Java");
	    System.out.println("Removed value: " + value);
	 // iterate through key/value entries
	    System.out.print("\nEntries: ");
	    for (Entry<String, Integer> entry : languages.entrySet()) {
	      System.out.print(entry);
	      System.out.print(", ");
	    }
	    // create a treemap
	    TreeMap<String, Integer> evenNumbers = new TreeMap<>();
	    evenNumbers.put("Two", 2);
	    evenNumbers.put("Four", 4);
	    System.out.println("TreeMap: " + evenNumbers);

	    // create hashmap from the treemap
	    HashMap<String, Integer> number = new HashMap<>(evenNumbers);
	    numbers.put("Three", 3);
	    System.out.println("HashMap: " + numbers);
	    
	  }

}
