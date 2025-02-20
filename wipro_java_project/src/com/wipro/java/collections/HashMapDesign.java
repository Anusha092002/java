package com.wipro.java.collections;

//Node class for HashMap
class HashNode<K, V> {
 K key;
 V value;
 HashNode<K, V> next;

 public HashNode(K key, V value) {
     this.key = key;
     this.value = value;
     this.next = null;
 }
}

//Custom HashMap Implementation
class CustomHashMap<K, V> {
 private int capacity;
 private int size;
 private HashNode<K, V>[] bucketArray;

 @SuppressWarnings("unchecked")
 public CustomHashMap(int capacity) {
     this.capacity = capacity;
     this.size = 0;
     this.bucketArray = new HashNode[capacity];
 }

 // Hash function
 private int getBucketIndex(K key) {
     return Math.abs(key.hashCode()) % capacity;
 }

 // Insert or update key-value pair
 public void put(K key, V value) {
     int index = getBucketIndex(key);
     HashNode<K, V> head = bucketArray[index];

     // Update value if key exists
     while (head != null) {
         if (head.key.equals(key)) {
             head.value = value;
             return;
         }
         head = head.next;
     }

     // Insert new node at the start of the bucket
     HashNode<K, V> newNode = new HashNode<>(key, value);
     newNode.next = bucketArray[index];
     bucketArray[index] = newNode;
     size++;
 }

 // Retrieve value by key
 public V get(K key) {
     int index = getBucketIndex(key);
     HashNode<K, V> head = bucketArray[index];

     while (head != null) {
         if (head.key.equals(key)) {
             return head.value;
         }
         head = head.next;
     }
     return null;
 }

 // Remove key-value pair
 public void remove(K key) {
     int index = getBucketIndex(key);
     HashNode<K, V> head = bucketArray[index];
     HashNode<K, V> prev = null;

     while (head != null) {
         if (head.key.equals(key)) {
             if (prev != null) {
                 prev.next = head.next;
             } else {
                 bucketArray[index] = head.next;
             }
             size--;
             return;
         }
         prev = head;
         head = head.next;
     }
 }

 // Check if key exists
 public boolean containsKey(K key) {
     return get(key) != null;
 }

 // Get number of stored key-value pairs
 public int size() {
     return size;
 }

 // Display HashMap contents
 public void display() {
     for (int i = 0; i < capacity; i++) {
         HashNode<K, V> head = bucketArray[i];
         while (head != null) {
             System.out.println(head.key + " -> " + head.value);
             head = head.next;
         }
     }
 }
}

//Main class to test CustomHashMap
public class HashMapDesign {
 public static void main(String[] args) {
     CustomHashMap<String, Integer> map = new CustomHashMap<>(10);

     map.put("Alice", 101);
     map.put("Bob", 102);
     map.put("Charlie", 103);

     System.out.println("Value for Bob: " + map.get("Bob"));
     System.out.println("Contains Charlie? " + map.containsKey("Charlie"));

     map.remove("Charlie");
     System.out.println("Contains Charlie after removal? " + map.containsKey("Charlie"));

     System.out.println("Size of HashMap: " + map.size());

     System.out.println("HashMap contents:");
     map.display();
 }
}

