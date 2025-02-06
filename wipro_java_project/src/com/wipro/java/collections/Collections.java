/**
 * 
 */
package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * In this class Collection.java we demonstrate ArrayList, LinkedList and HashMap
 */
public class Collections {
	public static void printList(List<Student> list) {
        System.out.print("List\n");
        for (Student student : list) {
            System.out.print(student+"\n");
        }
        System.out.println(); // Newline for better readability
    }
	 public static void printMap(Map<Integer, Student> map) {
	        System.out.println("HashMap contents:");
	        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	        System.out.println(); // Newline for better readability
	    }
	public static void main(String a[]) {
		List<Student> studentList=new ArrayList<>();
		// Creating Student Objects
		Student s1=new Student("Anusha",101,21,"CSE");
		Student s2=new Student("Madhu",102,22,"CSE");
		Student s3=new Student("Anjith",103,21,"CSE");
		Student s4=new Student("Naphee",104,21,"CSE");
		// adding students to the studentList ArrayList
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		// Printing Students by calling printList() method
		printList(studentList);
		// Performing some ListOperations
		studentList.remove(1);
		studentList.add(1, s4);
		System.out.println("After Performing Operations\n");
		printList(studentList);
		// Now creating LinkedList for Maintaining Order of students they have registered
		
		List<Student> registerList=new LinkedList<>();
		registerList.add(s1);
		registerList.add(s2);
		registerList.add(s3);
		// Printing Students by calling printList() method
		printList(registerList);
		// Performing some ListOperations
		registerList.remove(1);
		registerList.add(1, s4);
		System.out.println("After Performing Operations\n");
		printList(registerList);
		// Now Creating HashMap Student details based on their ID
		Map<Integer,Student> studentMap=new HashMap<>();
		// adding students to map
		studentMap.put(s1.id, s1);
		studentMap.put(s2.id, s2);
		studentMap.put(s3.id, s3);
		// printing studentMap
		printMap(studentMap);
		// get students details my their id;
		System.out.println(studentMap.get(s2.id));
		// checking whether student existed or not by id
		
		System.out.println(studentMap.containsKey(s3.id));
		
		
		
		
		
	}

}
