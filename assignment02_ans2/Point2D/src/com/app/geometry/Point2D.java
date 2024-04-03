package com.app.geometry;

import java.util.Scanner;
import java.lang.Math;

public class Point2D 
{
	
		private int xAxis;
		private int yAxis;
	
		Scanner sc = new Scanner(System.in);
	
		public Point2D()
		{
			xAxis = 0;
			yAxis = 0;
		}
	
	
		public Point2D(int xAxis, int yAxis) 
		{
		
			this.xAxis = xAxis;
			this.yAxis = yAxis;
		}


		public int getXAxis() 
		{
			return xAxis;
		}


		public void setXAxis(int xAxis) 
		{
			this.xAxis = xAxis;
		}
	

		public int getYAxis() 
		{
			return yAxis;
		}


		public void setYAxis(int yAxis) 
		{
			this.yAxis = yAxis;
		}
	
	
		public void acceptPoint()
		{
			System.out.println("\nEnter value of X-axis : ");
			xAxis = sc.nextInt();
		
			System.out.println("Enter value of Y-axis : ");
			yAxis = sc.nextInt();
		
		}
	
	


//		public void displayPoint()
//		{
//			System.out.println("Value of X-axis : "+ getXAxis());
//			System.out.println("Value of Y-axis : "+ getYAxis());
//		}
//	
	
		
		
		public String getDetails()
		{
			String result;
			result = xAxis + "," + yAxis  ;
			return result; 
		}
	

	
	
		public boolean isEqual(Point2D p2)
		{
			if(this.xAxis == p2.xAxis)
			{
				if(this.yAxis == p2.yAxis)
				{
					return true;
				}
				else 
				{
					return false;
				}
									
			}
			else 
			{
			return false;
			}
			
	
		}
	
	
	
		public double calculateDistance(Point2D p2)
		{
				return Math.sqrt(Math.pow(this.xAxis - p2.xAxis,2) + Math.pow(this.yAxis - p2.yAxis,2));
										
		
		}



}
	
	
	
	

