/**
 * 
 */
package com.wipro.java.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstrating StreamApi
 */
public class StreamApi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("Apple","Cat","Orange");
		List<String> newList=list.stream()
				.map(String::toUpperCase)  // Convert each string to uppercase
                .collect(Collectors.toList());
		System.out.println("Uppercase List: "+newList );
		List<String> filterList=list.stream()
				.filter(name->name.length()>5)  // Filtering each name
                .collect(Collectors.toList());
		System.out.println("Filtered List: "+filterList );
		
		// Here we are creating a List using Arrays.asList() method
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
		List<Integer> sortedNumbers = numbers.stream()
		   .sorted()
		   .collect(Collectors.toList());
		for(int num:sortedNumbers) {
			System.out.println(num+" ");
		}
		List<Integer> numbers2 = Arrays.asList(10, 20, 5, 25, 30);
		int min = numbers.stream().min(Integer::compare).get();
		System.out.println("Minimum number in List numbers2"+min);
		int max = numbers.stream().max(Integer::compare).get();
		System.out.println("Maximum number in List numbers2"+max);

	}

}
