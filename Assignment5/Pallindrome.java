package com.sunbeam.string;

public class Pallindrome {
   public static void main(String[] args) {
	   String str="madam";
	  int start=0;
	  int end=str.length()-1;
	  boolean isPallindrome=true;
	  while(start<end) {
		  
		  if(str.charAt(start)==str.charAt(end)) {
			  start++;
			  end--;
		  }else {
		  isPallindrome=false;
		  break;
		  }
	  }
	  if(isPallindrome) {
	  System.out.println("String is pallindrome : "+str);
   }
	  else {
		  System.out.println("String is not Pallindrome : ");
	  }
}
   }
