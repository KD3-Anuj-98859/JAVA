package com.nit.drivingcost;

public class DrivingCostEstimate {
      int totalMiles;
      int costPerGallons;
      int avgMilesPerGallon;
      int parkingFees;
      int tollsCharges;
      public DrivingCostEstimate() {
    	  
      }
	  public DrivingCostEstimate(int totalMiles, int costPerGallons, int avgMilesPerGallon, int parkingFees,
			int tollsCharges) {
		super();
		this.totalMiles = totalMiles;
		this.costPerGallons = costPerGallons;
		this.avgMilesPerGallon = avgMilesPerGallon;
		this.parkingFees = parkingFees;
		this.tollsCharges = tollsCharges;
	  }
	  public int getTotalMiles() {
		  return totalMiles;
	  }
	  public void setTotalMiles(int totalMiles) {
		  this.totalMiles = totalMiles;
	  }
	  public int getCostPerGallons() {
		  return costPerGallons;
	  }
	  public void setCostPerGallons(int costPerGallons) {
		  this.costPerGallons = costPerGallons;
	  }
	  public int getAvgMilesPerGallon() {
		  return avgMilesPerGallon;
	  }
	  public void setAvgMilesPerGallon(int avgMilesPerGallon) {
		  this.avgMilesPerGallon = avgMilesPerGallon;
	  }
	  public int getParkingFees() {
		  return parkingFees;
	  }
	  public void setParkingFees(int parkingFees) {
		  this.parkingFees = parkingFees;
	  }
	  public int getTollsCharges() {
		  return tollsCharges;
	  }
	  public void setTollsCharges(int tollsCharges) {
		  this.tollsCharges = tollsCharges;
	  }
      
      public int calculateCost() {
    	  return tollsCharges+parkingFees+(totalMiles/avgMilesPerGallon)*costPerGallons;
      }
      
      
      
}
