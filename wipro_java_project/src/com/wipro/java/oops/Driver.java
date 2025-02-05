/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Driver {
    public static void main(String[] args) {
        LibraryUser student = new Student("Anusha", 101);
        LibraryUser faculty = new Faculty("Dr. Rao", 102);

        student.borrowBook();
        faculty.borrowBook();

        student.returnBook();
        faculty.returnBook();
        student.borrowBook();
        student.borrowBook();
        student.borrowBook();
        student.borrowBook();
        student.borrowBook();
        
    }
}

