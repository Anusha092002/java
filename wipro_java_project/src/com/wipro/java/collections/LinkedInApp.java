package com.wipro.java.collections;
// Here we implementing a user defined Linked List

// Basic structure of Linked List
class LinkedInConnection {
    String name;
    String jobTitle;
    LinkedInConnection next;

    public LinkedInConnection(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.next = null;
    }
}

class LinkedInList {
    private LinkedInConnection head;

    public LinkedInList() {
        this.head = null;
    }

    // Add a new connection at the end
    public void addConnection(String name, String jobTitle) {
        LinkedInConnection newConnection = new LinkedInConnection(name, jobTitle);
        if (head == null) {
            head = newConnection;
        } else {
            LinkedInConnection temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newConnection;
        }
    }

    // Add a new connection at a specific index
    public void addConnectionAtIndex(String name, String jobTitle, int index) {
        if (index < 0) return;
        LinkedInConnection newConnection = new LinkedInConnection(name, jobTitle);
        if (index == 0) {
            newConnection.next = head;
            head = newConnection;
            return;
        }
        LinkedInConnection temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        newConnection.next = temp.next;
        temp.next = newConnection;
    }

    // Remove a connection by name
    public void removeConnection(String name) {
        if (head == null) return;
        
        if (head.name.equals(name)) {
            head = head.next;
            return;
        }

        LinkedInConnection prev = null, temp = head;
        while (temp != null && !temp.name.equals(name)) {
            prev = temp;
            temp = temp.next;
        }

        if (temp != null) {
            prev.next = temp.next;
        }
    }

    // Remove a connection at a specific index
    public void removeConnectionAtIndex(int index) {
        if (head == null || index < 0) return;
        if (index == 0) {
            head = head.next;
            return;
        }
        LinkedInConnection temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) return;
        temp.next = temp.next.next;
    }

    // Search for a connection by name
    public boolean searchConnection(String name) {
        LinkedInConnection temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Get the total number of connections
    public int getConnectionCount() {
        int count = 0;
        LinkedInConnection temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Display all connections
    public void displayConnections() {
        LinkedInConnection temp = head;
        while (temp != null) {
            System.out.println("Name: " + temp.name + ", Job Title: " + temp.jobTitle);
            temp = temp.next;
        }
    }
}

public class LinkedInApp {
    public static void main(String[] args) {
        LinkedInList linkedIn = new LinkedInList();
        linkedIn.addConnection("Alice", "Software Engineer");
        linkedIn.addConnection("Bob", "Data Scientist");
        linkedIn.addConnection("Charlie", "Product Manager");
        
        System.out.println("LinkedIn Connections:");
        linkedIn.displayConnections();

        System.out.println("\nAdding David at index 1...");
        linkedIn.addConnectionAtIndex("David", "UX Designer", 1);
        linkedIn.displayConnections();
        
        System.out.println("\nRemoving Bob at index 2...");
        linkedIn.removeConnectionAtIndex(2);
        linkedIn.displayConnections();

        System.out.println("\nSearching for Alice: " + linkedIn.searchConnection("Alice"));
        System.out.println("Searching for Bob: " + linkedIn.searchConnection("Bob"));
        System.out.println("Total Connections: " + linkedIn.getConnectionCount());
    }
}
