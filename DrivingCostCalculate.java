package com.nit.drivingcost;

import java.util.Scanner;

public class DrivingCostCalculate {
	public static void main(String[] args) {
    
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Total Miles Per Day  : ");
      int totalMiles=sc.nextInt();
      System.out.println("Cost Per gallon of gasolin : ");
      int costPerGallon=sc.nextInt();
      System.out.println("Average miles per gallon   : ");
      int avgPerGallon=sc.nextInt();
      System.out.println("Parking Fees per day       :  ");
      int parkingFees=sc.nextInt();
      System.out.println("Tolls Per day              : ");
	  int tollPerDay=sc.nextInt();
	  DrivingCostEstimate dce=new DrivingCostEstimate(totalMiles,costPerGallon,avgPerGallon,parkingFees,tollPerDay);
	  System.out.println("Total Cost : "+dce.calculateCost());
	  
	}
}
