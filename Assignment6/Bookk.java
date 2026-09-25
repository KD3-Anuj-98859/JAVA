package com.cdac.bookmanagement;

public class Bookk {
    private String isbn;
    private double price;
    private String authorName;
    private int quatity;
    
    public Bookk() {
    	
    }
    
    
	public Bookk(String isbn, double price, String authorName, int quatity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quatity = quatity;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	


	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if(!(obj instanceof Bookk))
			return false;
		
		Bookk book=(Bookk) obj;
	int diff=this.getIsbn().compareTo(book.getIsbn());
	if(diff==0)
		return true;
	else
		return false;
		
	}


	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quatity=" + quatity + "]";
	}
   
}
