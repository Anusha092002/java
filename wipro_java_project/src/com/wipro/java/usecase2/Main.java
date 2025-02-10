/**
 * 
 */
package com.wipro.java.usecase2;

/**
 * 
 */
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderService orderService = new OrderService();

        while (true) {
            try {
                System.out.println("\n===== ORDER MANAGEMENT SYSTEM =====");
                System.out.println("1. Place a New Order");
                System.out.println("2. View All Orders");
                System.out.println("3. Search Orders by Customer ID");
                System.out.println("4. Calculate Total Revenue");
               
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = Integer.parseInt(scanner.nextLine().trim());

                if (choice == 6) {
                    System.out.println("Exiting...");
                    break;
                }

                switch (choice) {
                    case 1:
                        System.out.print("Enter Customer ID: ");
                        int customerId = Integer.parseInt(scanner.nextLine().trim());

                        // Display available products
                        System.out.println("Available Products:");
                        orderService.getProducts().forEach(p -> 
                            System.out.println(p.getId() + " - " + p.getName() + " ($" + p.getPrice() + ")")
                        );

                        System.out.print("Enter Product IDs (comma-separated): ");
                        String productInput = scanner.nextLine().trim();

                        List<Integer> productIds = Arrays.stream(productInput.split(","))
                                .map(String::trim)
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

                        orderService.placeOrder(customerId, productIds);
                        break;

                    case 2:
                        orderService.displayOrders();
                        break;
                        
                    case 3:
                        System.out.print("Enter Customer ID: ");
                        int searchCustomerId = Integer.parseInt(scanner.nextLine().trim());
                        orderService.searchOrdersByCustomer(searchCustomerId);
                        break;

                    case 4:
                        orderService.calculateTotalRevenue();
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}

