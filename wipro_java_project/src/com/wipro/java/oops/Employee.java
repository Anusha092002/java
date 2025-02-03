/**
 * 
 */
package com.wipro.java.oops;

/**
 *@author pinni 
 *This Employee Class Represents the Employee Entity
 */
public class Employee {
	
	private int employee_id;//This is Employee Id
    private String employee_name;//This is  Employee Name
    private String empolyee_email;//This is  Employee Email
    private String employee_department;// This is Employee Department
    
    
    
    // getters and settes methods to access private fields
	
	public int getEmployee_id() {
		return employee_id;
	}


	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}


	public String getEmployee_name() {
		return employee_name;
	}


	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}


	public String getEmpolyee_email() {
		return empolyee_email;
	}


	public void setEmpolyee_email(String empolyee_email) {
		this.empolyee_email = empolyee_email;
	}


	public String getEmployee_department() {
		return employee_department;
	}


	public void setEmployee_department(String employee_department) {
		this.employee_department = employee_department;
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}

	
	

}
