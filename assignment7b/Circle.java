package assignment7b;

public class Circle {
 private double myX;
 private double myY;
 private double diameter;
 
 public Circle(){
	 
 }

 public Circle(double myX, double myY, double diameter) {
	super();
	this.myX = myX;
	this.myY = myY;
	if(diameter<0) {
		throw new NegativeDiameterException("Negative Diameter :");
	}
	this.diameter = diameter;
}

 public double getMyX() {
	return myX;
 }

 public void setMyX(double myX) {
	this.myX = myX;
 }

 public double getMyY() {
	return myY;
 }

 public void setMyY(double myY) {
	this.myY = myY;
 }

 public double getDiameter() {
	return diameter;
 }

 public void setDiameter(double diameter) {
	this.diameter = diameter;
 }
 
 
 
 
 
}
