package com.app.fruits;

public class Orange extends Fruit{
	

	public Orange()
	{
		this.setName("Orange");
		this.setColor("Tange");
		this.setWeight(30);
	}
	
	@Override
	public String taste()
	{
		return "sour";
	}
	
	

}
