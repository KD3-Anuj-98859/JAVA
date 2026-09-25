package com.sunbeam.day2;

public class Employee {
   String firstName;
   String lastName;
   double salary;
   
   public Employee() {
	   
   }
   public Employee(String firstName,String lastName,double salary) {
	   this.firstName=firstName;
	   this.lastName=lastName;
	   if(salary>0) {
	   this.salary=salary;
      }
	 }
   public String getFirstName() {
	return firstName;
   }
   public void setFirstName(String firstName) {
	this.firstName = firstName;
   }
   public String getLastName() {
	return lastName;
   }
   public void setLastName(String lastName) {
	this.lastName = lastName;
   }
   public double getSalary() {
	return salary;
   }
   public void setSalary(double salary) {
	this.salary = salary;
   }
   public void increment() {
	   this.salary=(salary*0.1)+salary;
   }
   
   
}
