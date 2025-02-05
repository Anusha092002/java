/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public abstract class LibraryUser {
	private String name;
	private int userId;
	
    public LibraryUser(String name, int userId) {
		
		this.name = name;
		this.userId = userId;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	 public String getName() {
	        return name;
	    }
	

   

    // Abstract method (Abstraction) - must be implemented in subclasses
    public abstract void borrowBook();

    public void returnBook() {
        System.out.println(name + " has returned a book.");
    }

   

}
