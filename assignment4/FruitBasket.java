package com.sunbeam.fruits;

import java.util.Scanner;

public class FruitBasket {
 public static void main(String [] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Basket Size : ");
	 int size=sc.nextInt();
	 Fruit [] fruits=new Fruit[size];
	 int element=0;
	 int choice=0;
	 do {
		 if(element>size) {
			 break;
		 }
		 System.out.println("0. Exit");
		 System.out.println("1. Add Mango");
		 System.out.println("2. Add Orange");
		 System.out.println("3. Add Apple");
		 System.out.println("4. Display All Fruits");
		 System.out.println("5. Display name, color, weight, taste of all fresh fruits, in the basket.");
		 System.out.println("6.  Display tastes of all stale (not fresh) fruits in the basket. ");
		 System.out.println("7. Mark a fruit as stale ");
		 System.out.println("8. Mark all sour fruits stale ");
		 System.out.println("Enter Choice : ");
	     choice=sc.nextInt();
	     switch(choice) {
	     case 1:{
	    	
	    	 System.out.println("Enter weight :");
	    	 double weight=sc.nextDouble();
	    	  fruits[element++]=new Mango("Yellow",weight,"Mango",true);
	    	 break;
	    	 }
	     case 2:{
	    	
	    	 System.out.println("Enter weight :");
	    	 double weight=sc.nextDouble();
	    	  fruits[element++]=new Orange("orange",weight,"Orange",true);
	    	 break;
	     }
	     case 3:{
	    	 System.out.println("Enter weight :");
	    	 double weight=sc.nextDouble();
	    	  fruits[element++]=new Mango("Red",weight,"Apple",true);
	    	 break;
	    	}
	     case 4:{
	    	   for(int i=0;i<element;i++) {
	                if(fruits[i]==null) {
	                	break;
	                }    	
				    System.out.println(fruits[i].getName());
	    	   }
	    	   break;
	    	   }
	     case 5:
	     {
	    	 for(int i=0;i<element;i++) {
	    	       System.out.println(fruits[i]);
	    	   }
	    	 break;
	    	}
	     case 6:{
	    	 for(int i=0;i<element;i++) {
	    	 if(!fruits[i].isFresh()) {
	    		 System.out.println(fruits[i].getName()+" "+fruits[i].taste());
	    	 }
	    		 
	    	 }
	      break;
	     }
	     case 7 :{
	    	 System.out.println("Enter Index :");
	    	 int index=sc.nextInt();
	    	 if(index>element ||index<0) {
	    	   System.err.println("Invaild Index :");
	    	   break;
	    	 }
	    	 fruits[index].setFresh(false);
	    	
	    	 }
	     case 8 :{ 
	    	 for(int i=0;i<element;i++) {
	    	    if("sour".equals(fruits[i].taste())) {
	    	    	fruits[i].setFresh(false);
	    	    }	 
	    	 }
	    	 }
	     default :
	    	 System.out.println("Invailid :");
	    	 
	     
	     }
	     
	     
	     
	 }while(choice!=0);
	 sc.close();
 }
}
