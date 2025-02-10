package com.wipro.java.usecase2;

import java.util.List;

public interface OrderServiceInterface {
    void placeOrder(int customerId, List<Integer> productIds);
    void displayOrders();
    void searchOrdersByCustomer(int customerId);
    void calculateTotalRevenue();
   
}

