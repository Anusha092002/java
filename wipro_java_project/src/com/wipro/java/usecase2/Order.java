/**
 * 
 */
package com.wipro.java.usecase2;

/**
 * 
 */
import java.time.LocalDateTime;
import java.util.List;

public abstract class Order {  // Abstract class
    protected int orderId;
    protected int customerId;
    protected List<Product> products;
    protected LocalDateTime orderTime;

    public Order(int orderId, int customerId, List<Product> products) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.products = products;
        this.orderTime = LocalDateTime.now();
    }

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    // Abstract method - must be implemented by subclasses
    public abstract String getOrderType();

    @Override
    public String toString() {
        return "Order [" + getOrderType() + " ID: " + orderId + ", Customer ID: " + customerId +
               ", Total: $" + getTotalPrice() + ", Time: " + orderTime + "]";
    }
}


