package com.wipro.java.collections;

import java.util.*;

public class StudentHashMap {
    public static void main(String[] args) {
        // Using HashMap to store duplicate names and roll numbers
        Map<String, List<Integer>> studentMap = new HashMap<>();
        
        // Sample data with duplicate names and roll numbers
        String[] names = {"John", "Alice", "Bob", "Alice", "John", "Eve", "Charlie", "Eve", "Bob", "Charlie"};
        int[] rollNumbers = {101, 102, 103, 104, 101, 105, 106, 107, 103, 106};
        
        // Storing data in HashMap
        for (int i = 0; i < names.length; i++) {
            studentMap.putIfAbsent(names[i], new ArrayList<>());
            studentMap.get(names[i]).add(rollNumbers[i]);
        }
        
        // Displaying the stored students
        for (Map.Entry<String, List<Integer>> entry : studentMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + " - Roll Numbers: " + entry.getValue());
        }
    }
}
