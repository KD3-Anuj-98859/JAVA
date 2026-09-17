package com.sunbeam.day2;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
    	Employee emp=new Employee();
        Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Employee First Name : ");
        String firstName=sc.next();
        emp.setFirstName(firstName);
        System.out.println("Enter Employee Last Name : ");
        String lastName=sc.next();
        emp.setLastName(lastName);
        System.out.println("Enter Employee Salary : ");
        double salary=sc.nextDouble();
        emp.setSalary(salary);
        
        System.out.println("Employee Details : ");
        System.out.println("First Name : "+emp.getFirstName());
        System.out.println("Last Name  : "+emp.getLastName());
        System.out.println("Salary     : "+emp.getSalary());
        
        emp.increment();//increment salary
        System.out.println("Employee Details : ");
        System.out.println("First Name : "+emp.getFirstName());
        System.out.println("Last Name  : "+emp.getLastName());
        System.out.println("Salary     : "+emp.getSalary());
         
        Employee emp1=new Employee(firstName,lastName,salary);
        
        System.out.println("Employee Details : ");
        System.out.println("First Name : "+emp1.getFirstName());
        System.out.println("Last Name  : "+emp1.getLastName());
        System.out.println("Salary     : "+emp1.getSalary());
        
    }
}
