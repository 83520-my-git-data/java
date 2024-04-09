package com.company;

import java.util.Scanner;

public class CommissionEmployee extends Employee
{
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee() {}
	
	
	public CommissionEmployee(String firstName, String lastName, int SSN, double grossSales, double commissionRate) 
	{
		super(firstName, lastName, SSN);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		
	}
	
	Scanner sc = new Scanner(System.in);
	
	public double getGrossSales() 
	{
		return grossSales;
	}


	public double getCommissionRate() 
	{
		return commissionRate;
	}

	
	public void setGrossSales(double grossSales) 
	{
		this.grossSales = grossSales;
	}


	public void setCommissionRate(double commissionRate) 
	{
		this.commissionRate = commissionRate;
	}



	@Override
	public void acceptData() 
	{
		super.acceptData();
		
		System.out.println("Enter Gross sales : ");
		grossSales = sc.nextDouble();
		
		System.out.println("Enter Commission rate : ");
		commissionRate = sc.nextDouble();
	}
	
	@Override
	public void displayData() 
	{
		super.displayData();
		
		System.out.println("Gross sales : " + grossSales);
		System.out.println("Commission Rate : " + commissionRate);
	}
	
	@Override
	public void calculateTotalSalary() 
	{
		double earning;
		earning = commissionRate * grossSales;
		System.out.println("Total salary : " + earning);
	}

}
