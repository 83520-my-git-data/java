package com.company;

import java.util.Scanner;

public class BasePlusCommissionEmployee extends CommissionEmployee 
{
	
	private double baseSalary;
	
	Scanner sc = new Scanner(System.in);
	
	public BasePlusCommissionEmployee() {}
	
	public BasePlusCommissionEmployee(String firstName, String lastName, int SSN, double grossSales,
			double commissionRate, double baseSalary) 
	{
		super(firstName, lastName, SSN, grossSales, commissionRate);
		this.baseSalary = baseSalary;
		
	}
	
	@Override
	public void acceptData()
	{
		super.acceptData();
		
		System.out.println("Enter base salary : ");
		baseSalary = sc.nextDouble();
	}
	
	@Override
	public void displayData()
	{
		super.displayData();
		
		System.out.println("Base salary : " + baseSalary);
	}
	
	@Override
	public void calculateTotalSalary()
	{
		double earning;
		
		//double increment = (baseSalary + baseSalary*0.1);
		
		//System.out.println("Base salary : " + baseSalary);
		
		//System.out.println("Base salary after 10% Increment : " + increment);
		
		earning = baseSalary + (getCommissionRate() * getGrossSales()) ;
		
		System.out.println("Total salary : " + earning);
		
	}
	
	public void incrementSalary()
	{
		double earning;
		
		double newBaseSalary = (baseSalary + baseSalary*0.1);
		
		//System.out.println("Base salary : " + baseSalary);
		
		System.out.println("Base salary after 10% Increment : " + newBaseSalary);
		
		earning = newBaseSalary + (getCommissionRate() * getGrossSales()) ;
		
		System.out.println("New Total salary : " + earning);
		
		
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
