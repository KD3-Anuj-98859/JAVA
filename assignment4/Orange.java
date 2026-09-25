package com.sunbeam.fruits;

public class Orange extends Fruit{
  public Orange(String color,double weight,String name,boolean isFresh) {
	  super(color,weight,name,isFresh);
  }
  public String taste() {
	  return "sour";
  }
}
