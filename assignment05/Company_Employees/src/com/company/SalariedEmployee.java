package com.company;

import java.util.Scanner;

public class SalariedEmployee extends Employee
{
	
	private double weeklySalary;
	
	public SalariedEmployee() {}

	public SalariedEmployee(String firstName, String lastName, int SSN, double weeklySalary) 
	{
		super(firstName, lastName, SSN);
		this.weeklySalary = weeklySalary;
	}
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void acceptData() 
	{
		super.acceptData();
		
		System.out.println("Enter weekly salary : ");
		weeklySalary = sc.nextDouble();
	}
	
	@Override
	public void displayData() 
	{
		super.displayData();
		
		System.out.println("Weekly Salary : " + weeklySalary);
	}
	
	public  void calculateTotalSalary() {}
	

	
	
	
}
