package com.app.geometry;

public class Point2d {
	
	private int x;
	private int y;
	public Point2d(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getDetails() {
		return "X cordinate : "+x+"Y cordinate"+y; 
	}
	
	public boolean isEqual(Point2d p1) {
		return (this.x==p1.getX() && this.y==p1.getY()) ;
	}
	public  double calculateDistance(Point2d p2 ){
             double sq1 =Math.pow((p2.getX()-this.x),2);
             double sq2=Math.pow((p2.getX()-this.x),2);
          return Math.sqrt(sq1+sq2);
	}
}

