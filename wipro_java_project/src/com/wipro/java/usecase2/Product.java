/**
 * 
 */
package com.wipro.java.usecase2;

/**
 * we are implementing OrderService Management Service System....
 * Product----Pojo
 * Order---Base class
 * OnineOrder and InstoreOrder are child classes of Order class
 * OrderServiceInterface is Interface
 * OrderService is implements OrderServiceInterface
 * Abstraction by Order where getOrderType is abstraction method  
 */
public class Product {
    private int id;
    private String name;
    private double price;
    /**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}



	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}



	

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

  

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + "}";
    }
}

