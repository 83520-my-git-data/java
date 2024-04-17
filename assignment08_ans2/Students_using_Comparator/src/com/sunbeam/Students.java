package com.sunbeam;


import java.util.Scanner;

public class Students
{
	private int rollno;
	private double marks;
	private String name;
	private String city;
	
	public Students() {}
	
	public Students(int rollno, String name, double marks, String city)
	{
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.city = city;
	}
	
	Scanner sc = new Scanner(System.in);
	
	
	public int getRollno() 
	{
		return rollno;
	}

	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}

	public double getMarks() 
	{
		return marks;
	}

	public void setMarks(double marks) 
	{
		this.marks = marks;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}
	
	public void accept()
	{
		System.out.println("Enter rollno : ");
		rollno = sc.nextInt();
		
		System.out.println("Enter name : ");
		name = sc.next();
		
		System.out.println("Enter marks : ");
		marks = sc.nextDouble();
		
		System.out.println("Enter city : ");
		city = sc.next();
	}
	
	public String toString()
	{
		return "\nRollno : " + rollno + "\nName : " + name + "\nMarks : " + marks + "\nCity : " + city;
	}

	

	
}
