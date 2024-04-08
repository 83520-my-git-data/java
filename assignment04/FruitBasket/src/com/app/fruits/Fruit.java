package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public Fruit()
	{
	}
	
	Scanner sc = new Scanner(System.in);
	
	public Fruit( boolean isFresh)
	{
		this.isFresh = isFresh;
	}
	
	public void acceptFruit()
	{
//		System.out.println("Enter name of fruit : ");
//		name = sc.next();
//		
		System.out.println("Is fruit fresh - True or False");
		isFresh = sc.nextBoolean();
		
//		System.out.println("Fruit color : ");
//		color = sc.next();
		
//		System.out.println("Fruit weight : ");
//		weight = sc.nextDouble();
	}
	
//	public void displayFruit()
//	{
//		System.out.println("Fruit name : " + name);
//		System.out.println("Is fruit fresh : " + isFresh);
//	}
	
	public String toString()
	{
		return "Fruit name : " + name
				+ "\nFresh : " + isFresh
				+ "\nColor : " + color
				+ "\nWeight : " + weight ;
	}
	
	
	public String taste()
	{
		return "no specific taste";
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public double getWeight() 
	{
		return weight;
	}

	public void setWeight(double weight) 
	{
		this.weight = weight;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public boolean isFresh() 
	{
		return isFresh;
	}

	public void setFresh(boolean isFresh) 
	{
		this.isFresh = isFresh;
	}


	
	
	
	
	
}
