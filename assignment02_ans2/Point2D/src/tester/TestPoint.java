package tester;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		Point2D p1 = new Point2D();
		p1.acceptPoint();
		System.out.println("1st Point : "+p1.getDetails());
		System.out.println("________________");
		
		Point2D p2 = new Point2D();
		p2.acceptPoint();
		System.out.println("2nd Point : "+p2.getDetails());
		System.out.println("________________");
		
		
		if(p1.isEqual(p2))
		{
			System.out.println("\nBoth Points are equal");
		}
		else
		{
			System.out.println("\nBoth Points are not equal");
			System.out.println("Distance : "+ p1.calculateDistance(p2));
		}
		
		
		

	}


}
