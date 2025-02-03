/**
 * 
 */
package com.wipro.java.oops;

/**
 * Parent class= Employee
 * Child class= Manager
 * extends is an keyword to inherit Parent class from Child class
 */
public class Developer extends Employee {
	//constructor
    public Developer() {
    	
    }
    public static void main(String a[]) {
	// child object is instantiated from child constructor
	//parent class consumes the prop and behaviours of child class
    	Employee developer=new Developer();
    	developer.setEmployee_id(121);
    	developer.setEmployee_name("Anusha");
    	developer.setEmpolyee_email("anusha@123gmail.com");
    	developer.setEmployee_department("Developement");
    	System.out.println("Employee Id: "+developer.getEmployee_id()+"\nEmployee Name: "+developer.getEmployee_name()+"\nEmployee Email: "+developer.getEmpolyee_email()+"\nEmployee Department: "+developer.getEmployee_department());
    	
    }
}
