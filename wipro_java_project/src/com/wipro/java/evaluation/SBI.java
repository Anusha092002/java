/**
 * 
 */
package com.wipro.java.evaluation;

/**
 * This is Child class
 */
public class SBI extends Bank {
	private float balance;
	public SBI(float initialBalance) {
        this.balance = initialBalance;
    }
	float rateOfInterest=9f;
	public void deposit(float amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Overloaded method to deposit money (with two parameters - deposit amount and deposit reason)
    public void deposit(float amount, String reason) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " for reason: " + reason);
        } else {
            System.out.println("Invalid amount.");
        }
    }
	public void rateOfInterest() {
		System.out.println("SBI Rate of Interest is:"+rateOfInterest);
	}

}
