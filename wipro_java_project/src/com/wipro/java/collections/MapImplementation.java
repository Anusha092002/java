/**
 * 
 */
package com.wipro.java.collections;

import java.util.HashMap;
import java.util.Map;
/**
 * HashMap stores key-value pairs, key should be unique...
 */

public class MapImplementation {
    public static void main(String[] args) {
        // Create a HashMap
        Map<Integer, String> map = new HashMap<>();

        //Add key-value pairs to the HashMap
        map.put(1, "Apple");
        map.put(2, "Samsung");
        map.put(3, "Vivo");
        System.out.println("After adding elements:");
        printMap(map);
        // get value from map
        System.out.println("Value by using get method : "+map.get(2));

        //Update a value in the HashMap
        map.put(2, "Galaxy");
        System.out.println("After updating key 2 to 'Galaxy':");
        printMap(map);

        //Remove an element by key
        map.remove(3);
        System.out.println("After removing key 3:");
        printMap(map);

        //Check if a key exists using containsKey()
        int keyToCheck = 2;
        if (map.containsKey(keyToCheck)) {
            System.out.println("Key " + keyToCheck + " exists with value: " + map.get(keyToCheck));
        } else {
            System.out.println("Key " + keyToCheck + " does not exist.");
        }
    }

    // Method to print HashMap using a for-each loop
    public static void printMap(Map<Integer, String> map) {
        System.out.println("HashMap contents:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println(); // Newline for better readability
    }
}
