/**
 * 
 */
package com.wipro.java.oops;

/**
 * Parent class= Employee
 * Child class= Manager
 * extends is an keyword to inherit Parent class from Child class
 */
public class Manager extends Employee {
	//constructor
    public Manager() {
    	
    }
    public static void main(String a[]) {
    	
    	Employee manager=new Manager();
    	manager.setEmployee_id(122);
    	manager.setEmployee_name("Anusha");
    	manager.setEmpolyee_email("anusha@123gmail.com");
    	manager.setEmployee_department("Management");
    	System.out.println("Employee Id: "+manager.getEmployee_id()+"\nEmployee Name: "+manager.getEmployee_name()+"\nEmployee Email: "+manager.getEmpolyee_email()+"\nEmployee Department: "+manager.getEmployee_department());
    	
    }
}
