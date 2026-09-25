package com.sunbeam.fruits;

public class Apple extends Fruit {
 public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	
	}
public String getName() {
	return super.getName();
}
 public String taste() {
	 return "sweet and sour";
 }
}
