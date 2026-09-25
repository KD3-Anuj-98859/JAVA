package com.sunbeam.creditcard;

public class Customer {
    int accountNumber;
    int balance;
    int totalCharged;
    int totalAllCredits;
    int allowedCreditLimit;
    
    public Customer(int accountNumber, int balance, int totalCharged, int totalAllCredits, int allowedCreditLimit) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.totalCharged = totalCharged;
		this.totalAllCredits = totalAllCredits;
		this.allowedCreditLimit = allowedCreditLimit;
	}
   
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getTotalCharged() {
		return totalCharged;
	}

	public void setTotalCharged(int totalCharged) {
		this.totalCharged = totalCharged;
	}

	public int getTotalAllCredits() {
		return totalAllCredits;
	}

	public void setTotalAllCredits(int totalAllCredits) {
		this.totalAllCredits = totalAllCredits;
	}

	public int getAllowedCreditLimit() {
		return allowedCreditLimit;
	}

	public void setAllowedCreditLimit(int allowedCreditLimit) {
		this.allowedCreditLimit = allowedCreditLimit;
	}

	public int newBalance() {
    	return balance+totalCharged-totalAllCredits;
    }
    
    
    
    
    
}
