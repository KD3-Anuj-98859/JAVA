package com.sunbeam.day2;

import java.util.Scanner;

public class InvoiceTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		Invoice invoice = new Invoice();
		
		System.out.println("Enter part number : ");
		String partNumber = sc.next();
		invoice.setPartNumber(partNumber);
		
		System.out.println("Enter description : ");
		String description = sc.next();
		invoice.setDescription(description);
		
		System.out.println("Enter Quatity : ");
		int qty = sc.nextInt();
		invoice.setQty(qty);
		
		System.out.println("Enter price : ");
		double price = sc.nextDouble();
        invoice.setPrice(price);
     //   System.out.println("Invoice : "+invoice);
        System.out.println("Part Number : "+invoice.getPartNumber());
        System.out.println("Description : "+invoice.getDescription());
        System.out.println("Quantity    : "+invoice.getQty());
        System.out.println("Price       : "+invoice.getPrice());
        System.out.println("Total Amount: "+invoice.totalAmount());
        
        
        System.out.println("By constructor value:");
        Invoice invoice1=new Invoice(partNumber,description,qty,price);
        System.out.println("Part Number : "+invoice.getPartNumber());
        System.out.println("Description : "+invoice.getDescription());
        System.out.println("Quantity    : "+invoice.getQty());
        System.out.println("Price       : "+invoice.getPrice());
        System.out.println("Total Amount: "+invoice.totalAmount());
    
        sc.close();
	}
}