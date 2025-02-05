/**
 * 
 */
package com.wipro.java.oops.interfacedemo;

/**
 * Document is a class and implements the Interface IPrintable,IShowable
 */
public class Document implements IPrintable,IShowable {

	/**
	 * @param args
	 */
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Document is showing... ");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Document is printing... ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPrintable doc1=new Document();// creating a object with reference to IPrintable
		doc1.print();
		IShowable doc2=new Document(); // creating a object with reference to IShowable
		doc2.show();
		

	}


}
