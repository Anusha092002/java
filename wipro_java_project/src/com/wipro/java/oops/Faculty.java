/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
class Faculty extends LibraryUser {
	private  int  borrowBook;
    public Faculty(String name, int userId) {
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
        System.out.println(getName() + " (Faculty) borrowed a book.");
    	}
    }


	 public void returnBook() {
		 borrowBook--;
	        System.out.println("Faculty has returned a book.");
	    }

}
