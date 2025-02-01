/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */

 public class Main {
	public  Main(){
		 
	 }
	int num=5;
	public void changeValue(int num) {
        this.num = num;
    }

	 public static void main(String[] args) {
		 Main obj = new Main();// creating object
	        obj.changeValue(10);// calling method changeValue
	        System.out.println(obj.num);// Output will be 10
	    }

}
