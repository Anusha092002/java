package com.wipro.java.collections.usecase2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    // Main method to execute the application
    public static void main(String[] args) {
        // Step 1: Create and populate the TreeMap
        TreeMap<Integer, String> treeMap = createTreeMap();
        
        // Step 2: Create an empty HashMap to store the data
        HashMap<Integer, String> hashMap = new HashMap<>();
        
        // Step 3: Transfer data from TreeMap to HashMap
        transferDataToHashMap(treeMap, hashMap);
        
        // Step 4: Display the contents of both maps
        displayMaps(treeMap, hashMap);
    }

    // Method to create and populate the TreeMap
    public static TreeMap<Integer, String> createTreeMap() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Cherry");
        treeMap.put(4, "Date");
        treeMap.put(5, "Elderberry");
        
        return treeMap;
    }

    // Method to transfer data from TreeMap to HashMap
    public static void transferDataToHashMap(TreeMap<Integer, String> treeMap, HashMap<Integer, String> hashMap) {
        // Add all entries from TreeMap to HashMap
        hashMap.putAll(treeMap);
    }

    // Method to display the contents of both maps
    public static void displayMaps(TreeMap<Integer, String> treeMap, HashMap<Integer, String> hashMap) {
        System.out.println("TreeMap Data (Sorted):");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        System.out.println("\nHashMap Data (Unsorted):");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

