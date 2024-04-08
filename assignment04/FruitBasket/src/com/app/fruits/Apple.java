package com.app.fruits;

//import java.util.Scanner;

public class Apple extends Fruit {
	

	//Scanner sc = new Scanner(System.in);	
	
	
	public Apple()
	{
		this.setName("Apple");
		this.setColor("Red");
		this.setWeight(70);
	}
	
	@Override
	public String taste()
	{
		return "sweet n sour";
	}


}
