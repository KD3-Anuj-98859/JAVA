package com.sunbeam.creditcard;

public class CreditTest {
	public static void main(String[] args) {
		Customer customer=new Customer(123456,5000,2000,2000,2000);
		System.out.println("Account Number : "+customer.getAccountNumber());
		System.out.println("New Balance    : "+customer.newBalance());
		System.out.println("Credit Limit   : "+customer.getAllowedCreditLimit());
		if(customer.newBalance()>customer.allowedCreditLimit) {
			System.out.println("Credit Limit Exceed : ");
		}
		else {
			System.out.println("Credit Limit Not Exceed : ");
		}
	}
}
