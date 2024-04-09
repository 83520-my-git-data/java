package com.company;

import java.util.Scanner;

public abstract class Employee 
{
	
	private String firstName;
	private String lastName;
	private int SSN;
	
	public Employee() {}
	
	public Employee(String firstName, String lastName, int SSN)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
 	}

	Scanner sc = new Scanner(System.in);

	
	
	public String getFirstName() 
	{
		return firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}
	
	public int getSSN() 
	{
		return SSN;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	
	public void setSSN(int SSN) 
	{
		this.SSN = SSN;
	}
	
	public abstract void calculateTotalSalary();
	
	
	
	public void acceptData()
	{
		System.out.println("\nEnter first name of employee : ");
		firstName = sc.next();
		
		System.out.println("Enter last name of employee : ");
		lastName = sc.next();
		
		System.out.println("Enter Social Security Number (SSN) : ");
		SSN = sc.nextInt();
	}
	
	public void displayData()
	{
		System.out.println("\nFirst Name : " + firstName);
		System.out.println("Last Name : " + lastName);
		System.out.println("SSN : " + SSN);
	}
	
	

}
