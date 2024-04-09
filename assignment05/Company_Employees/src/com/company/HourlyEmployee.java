package com.company;

import java.util.Scanner;

public class HourlyEmployee extends Employee
{
	private int hrs;
	private double wage;
	
	Scanner sc = new Scanner(System.in);
	
	public HourlyEmployee() {}
	
	
	public HourlyEmployee(String firstName, String lastName, int SSN, int hrs, double wage)
	{
		super(firstName, lastName, SSN);
		this.hrs = hrs;
		this.wage = wage;
	}
	
	@Override
	public void acceptData() 
	{
		super.acceptData();
		
		System.out.println("Enter work hrs : ");
		hrs = sc.nextInt();
		
		System.out.println("Enter wage per hour : ");
		wage = sc.nextDouble();
		
		
	}
	
	@Override
	public void displayData() 
	{
		super.displayData();
		
		System.out.println("Work hrs : " + hrs);
		
		System.out.println("Wage per hour " + wage);
		
	}
	
	@Override
	public void calculateTotalSalary()
	{
		double earning;
		
		if(hrs <= 40)
		{
			earning = wage *hrs;
			
			System.out.println("Total Salary : " + earning);
		}
		else if(hrs > 40)
		{
			earning = 40 * wage + (hrs - 40) * wage * 1.5;
			
			System.out.println("Total Salary : " + earning);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
