/**
 * 
 */
package com.wipro.java.collections;

/**
 * 
 */
public class Student {
	String name;
	int id;
	int age;
	String department;
	public Student(String name, int id, int age, String department) {
		
		this.name = name;
		this.id = id;
		this.age = age;
		this.department = department;
	}
	
	@Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Age: " + age + ", Department: " + department;
    }

}
