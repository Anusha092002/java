/**
 * 
 */
package com.wipro.java.oops;

/**
 * Parent class= Employee
 * Child class= Manager
 * extends is an keyword to inherit Parent class from Child class
 */
public class ProjectLead extends Employee{
	//Constructor
    public ProjectLead() {
    	
    }
    public static void main(String a[]) {
    	// child object is instantiated from child constructor
    	//parent class consumes the prop and behaviours of child class
    	Employee employee=new ProjectLead();
    	employee.setEmployee_id(120);
    	employee.setEmployee_name("Anusha");
    	employee.setEmpolyee_email("anusha@123gmail.com");
    	employee.setEmployee_department("Project Guide");
    	System.out.println("Employee Id: "+employee.getEmployee_id()+"\nEmployee Name: "+employee.getEmployee_name()+"\nEmployee Email: "+employee.getEmpolyee_email()+"\nEmployee Department: "+employee.getEmployee_department());
    	
    }
}
