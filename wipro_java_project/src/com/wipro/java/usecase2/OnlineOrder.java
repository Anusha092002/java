/**
 * 
 */
package com.wipro.java.usecase2;

import java.util.List;

/**
 * 
 */
public class OnlineOrder extends Order {
    private String deliveryAddress;

    public OnlineOrder(int orderId, int customerId, List<Product> products, String deliveryAddress) {
        super(orderId, customerId, products);
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    @Override
    public String getOrderType() {
        return "Online Order";
    }

    @Override
    public String toString() {
        return super.toString() + " (Delivered to: " + deliveryAddress + ")";
    }
}

