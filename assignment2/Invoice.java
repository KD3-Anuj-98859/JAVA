package com.sunbeam.day2;

public class Invoice {
	String partNumber;
	String description;
	int qty;
	double price;
	double totalAmount;
    public Invoice() {
    	
    }
	public Invoice(String partNumber, String description, int qty, double price) {
		this.partNumber = partNumber;
		this.description = description;
		if(qty>0) {
     		this.qty = qty;
		}
		if(price>0) {
		this.price = price;
		}
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
	    if(qty>0) {
		    this.qty = qty;
	      }
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price>0) {
		this.price = price;
     	}
		}
	public double totalAmount() {
	return price*qty;
	}

	
	
	
	
	
	
	
	
	
	

}