/**
 * 
 */
package com.wipro.java.usecase2;

import java.util.List;

/**
 * 
 */
public class InStoreOrder extends Order {
    public InStoreOrder(int orderId, int customerId, List<Product> products) {
        super(orderId, customerId, products);
    }

    @Override
    public String getOrderType() {
        return "In-Store Order";
    }
}
