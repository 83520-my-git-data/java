package com.app.fruits;

public class Mango extends Fruit{
	
	
	public Mango()
	{
		this.setName("Mango");
		this.setColor("Yellow");
		this.setWeight(100);
	}
	
	@Override
	public String taste()
	{
		return "sweet";
	}
}
