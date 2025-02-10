/**
 * 
 */
package com.wipro.java.usecase2;

/**
 * 
 */
import java.util.*;
import java.util.stream.Collectors;

public class OrderService implements OrderServiceInterface {
    private List<Product> productCatalog;
    private List<Order> orders;
    private int orderIdCounter = 1;

    public OrderService() {
        this.productCatalog = new ArrayList<>();
        this.orders = new ArrayList<>();
        seedProducts();
    }

    private void seedProducts() {
        productCatalog.add(new Product(1, "Laptop", 1200));
        productCatalog.add(new Product(2, "Phone", 800));
        productCatalog.add(new Product(3, "Headphones", 150));
        productCatalog.add(new Product(4, "Smartwatch", 200));
    }

    public List<Product> getProducts() {
        return productCatalog;
    }

    @Override
    public void placeOrder(int customerId, List<Integer> productIds) {
        List<Product> orderedProducts = productIds.stream()
                .map(this::findProductById)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        if (orderedProducts.isEmpty()) {
            System.out.println("❌ Invalid product selection!");
            return;
        }

        System.out.println("Is this an Online Order? (yes/no)");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine().trim().toLowerCase();

        Order newOrder;
        if (choice.equals("yes")) {
            System.out.print("Enter Delivery Address: ");
            String address = scanner.nextLine().trim();
            newOrder = new OnlineOrder(orderIdCounter++, customerId, orderedProducts, address);
        } else {
            newOrder = new InStoreOrder(orderIdCounter++, customerId, orderedProducts);
        }

        orders.add(newOrder);
        System.out.println("Order Placed Successfully! Order ID: " + newOrder.getOrderId());
    }

    private Product findProductById(int id) {
        return productCatalog.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders placed yet!");
        } else {
            orders.forEach(System.out::println);
        }
    }

    @Override
    public void searchOrdersByCustomer(int customerId) {
        List<Order> customerOrders = orders.stream()
                .filter(order -> order.getCustomerId() == customerId)
                .collect(Collectors.toList());

        if (customerOrders.isEmpty()) {
            System.out.println("No orders found for customer ID " + customerId);
        } else {
            customerOrders.forEach(System.out::println);
        }
    }

    @Override
    public void calculateTotalRevenue() {
        double totalRevenue = orders.stream()
                .mapToDouble(Order::getTotalPrice)
                .sum();
        System.out.println("Total Revenue: $" + totalRevenue);
    }

    
}

