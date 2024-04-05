package com.sunbeam;

import java.util.Scanner;

public class CostSpent {
	
	Scanner sc = new Scanner(System.in);
	
	private double totalMiles ;
	private double costPerGallon ;
	private double avgMilesPerGallon ;
	private double parkingFeePerDay ;
	private double tollsPerDay ;
	
	
	
	public CostSpent(double totalMiles, double costPerGallon, double avgMilesPerGallon, double parkingFeePerDay,
			double tollsPerDay) 
	{
		
		this.totalMiles = totalMiles;
		this.costPerGallon = costPerGallon;
		this.avgMilesPerGallon = avgMilesPerGallon;
		this.parkingFeePerDay = parkingFeePerDay;
		this.tollsPerDay = tollsPerDay;
	}



	public CostSpent() 
	{
		
	}



	public void acceptDetails()
	{
		System.out.println("Enter Total miles driven per day : Rs.");
		totalMiles = sc.nextDouble();
		
		System.out.println("Enter Cost per gallon of gasoline : Rs.");
		costPerGallon = sc.nextDouble();
		
		System.out.println("Enter Average miles per gallon : Rs.");
		avgMilesPerGallon = sc.nextDouble();
		
		System.out.println("Enter Parking fees per day : Rs.");
		parkingFeePerDay = sc.nextDouble();
		
		System.out.println("Enter Tolls per day : Rs.");
		tollsPerDay = sc.nextDouble();
			
	}
	
	
	
	public void displayDetails()
	{
		System.out.println("\nTotal Miles driven : Rs."+ totalMiles);
		System.out.println("Cost per gallon of gasoline : Rs."+ costPerGallon);
		System.out.println("Average miles per gallon : Rs."+ avgMilesPerGallon);
		System.out.println("Parking fee per day : Rs."+ parkingFeePerDay);
		System.out.println("Tolls per day : Rs."+ tollsPerDay);
		
		
	}
	
	public void calculateCost()
	{
		double cost = 0;
		cost = (totalMiles/avgMilesPerGallon) * costPerGallon + parkingFeePerDay + tollsPerDay ;
		
		System.out.println("\nDaily driving cost : Rs." + cost);
		
	}
	
	
	
	
	
	

}
