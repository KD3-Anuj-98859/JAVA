package com.sunbeam.day2;

import java.util.Scanner;

public class DateTest {
   public static void main(String [] args) {
	Date date=new Date();
	int day;
	int month;
	int year;
	Scanner sc=new Scanner(System.in);
   System.out.println("Enter Day of date : ");
   day=sc.nextInt();
   date.setDay(day);
   System.out.println("Enter Month of date : ");
   month =sc.nextInt();
   date.setMonth(month);
   System.out.println("Enter Year of date : ");
   year=sc.nextInt();
   date.setYear(year);
   date.display();
   
   Date date1=new Date(12,7,2003);
   date1.display();
   }
}
