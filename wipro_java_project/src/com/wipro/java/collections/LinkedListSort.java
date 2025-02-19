package com.wipro.java.collections;

//Custom comparator to sort LinkedList in ascending order
import java.util.Comparator;
import java.util.LinkedList;

class LinkedListSortComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return a.compareTo(b); // Ascending order
    }
}

public class LinkedListSort {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(9);

        System.out.println("Original LinkedList: " + list);

        // Sort the LinkedList using a custom comparator
        list.sort(new LinkedListSortComparator());

        System.out.println("Sorted LinkedList: " + list);
    }
}

