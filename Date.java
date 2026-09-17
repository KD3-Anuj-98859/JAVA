package com.sunbeam.day2;

public class Date {
	private int month;
	private int year;
	private int day;

	public Date() {

	}

	public Date(int day,int month, int year) {
		if(day>0 && day<32) {
		this.day = day;
		}
		if(month>0 && month<13) {
		this.month = month;
		}
		if(year>0) {
		this.year = year;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month>0 && month<13) {
			this.month = month;
			}
			
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year>0) {
			this.year = year;
			}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		
		if(day>0 && day<32) {
			this.day = day;
			}
		
	}
	public void display() {
		System.out.println("Date details : ");
		System.out.println("Date : "+day+"/"+month+"/"+year);
	}

}
