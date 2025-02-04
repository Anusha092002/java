/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
class Student extends LibraryUser {
	private int borrowBook;
    public Student(String name, int userId) {
        super(name, userId);
        this.borrowBook=0;
    }
  //Implementing abstract method

    @Override
    public void borrowBook() {
    	if(borrowBook>3) {
    		System.out.println("You Exceeded the limit..");
    	}
    	else {
    		
    		borrowBook++;
        System.out.println(getName() + " (Student) borrowed a book.");
    	}
    }


	 public void returnBook() {
		 borrowBook--;
		 
	        System.out.println("Student has returned a book.");
	    }

}
