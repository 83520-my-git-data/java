package com.sunbeam.Invoice;

public class Invoice {
	
	private	String partNumber;
	private	String partDescription;
	private	int quantity;
	private	double price;

	
	
	public Invoice(String partNumber, String partDescription, int quantity, double price) 
	{
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}
	
	
	
	public void setQuantity(int quantity) //setter for quantity
	{
		if(quantity<0)
		{
			this.quantity = 0;
		}else {
			this.quantity = quantity;
		}
	}
	
	
	
	public void setPrice(double price) // setter for price
	{
		if(price<0)
		{
			this.price = 0.0;
		}else {
			this.price = price;
		}
	}
	
	

	

	
	public void setPartDescription(String partDescription) 
	{
		this.partDescription = partDescription;
	}
	
	
	
	public void setPartNumber(String partNumber) 
	{
		this.partNumber = partNumber;
	}
	
	
	
	
	public String getPartNumber() 
	{
		return partNumber;
	}
	
	
	
	
	public String getPartDescription() 
	{
		return partDescription;
	}
	
	


	public int getQuantity() 
	{
		return quantity;
	}
	
	

	public double getPrice() 
	{
		return price;
	}
	
	

	public double calculateInvoice()
	{
		return price*quantity;
	}
	

}
