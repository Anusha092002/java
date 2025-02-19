package com.wipro.java.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FibonacciTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = scanner.nextInt();
        scanner.close();

        TreeMap<Integer, Long> fibonacciMap = new TreeMap<>();

        // Generate Fibonacci series and store in TreeMap
        for (int i = 0; i < n; i++) {
            fibonacciMap.put(i, fibonacci(i));
        }

        // Print Fibonacci series stored in TreeMap
        System.out.println("Fibonacci Series:");
        for (Map.Entry<Integer, Long> entry : fibonacciMap.entrySet()) {
            System.out.println("Term " + entry.getKey() + ": " + entry.getValue());
        }
    }

    // Recursive function to calculate Fibonacci number
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
