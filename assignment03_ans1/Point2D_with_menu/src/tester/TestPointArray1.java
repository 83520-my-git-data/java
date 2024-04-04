package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		Point2D[] points = new Point2D[4];
		
		
		
		int choice ;
		
		
		
		do 
		{
			System.out.println("Enter 0 for EXIT");
			System.out.println("Enter 1 to Accept Coordinates");
			System.out.println("Enter 2 for Display details of a specific point ");
			System.out.println("Enter 3 for Display x, y co-ordinates of all points ");
			System.out.println("Enter 4 to Calculate Distance between two points ");
			
			choice = sc.nextInt();
			
			
			switch(choice)
			{
			case 0:
				System.out.println("Thank You.....");
				break;
			
			case 1:
				
			
					for(int i=0; i<points.length ; i++)
					{
						points[i] = new Point2D();
						points[i].acceptPoint();
					}
					break;
					
					
				
				
				
			
				
			case 2:
				int num;
				System.out.println("Enter Specific Index : ");
				num = sc.nextInt();
				
				if(-1 < num && num < points.length)
				{
					System.out.println("Point at index " + num + " is : " + points[num].getDetails() );
					System.out.println("____________________");
				}
				else
				{
					System.out.println("Invalid Index... Please try again. ");
					System.out.println("____________________");
				}
				
				break;
				
			
				
			case 3:
				for(int i=0; i<points.length; i++)
				{
					System.out.println("Point at index " + i + " is : " + points[i].getDetails() );
					System.out.println("____________________");
				}
				break;
				
				
				
				
			case 4:
				int num1, num2;
				System.out.println("Enter index of 1st point ");
				num1 = sc.nextInt();
				
				if(-1 < num1 && num1 < points.length)
				{
					
					System.out.println("Enter index of 2nd point ");
					num2 = sc.nextInt();
					
					if(-1 < num2 && num2 < points.length)
					{
						
						if(points[num1].isEqual(points[num2]))
						{
							System.out.println("\nBoth Points are equal");
							System.out.println("____________________");
						}
						else
						{
							System.out.println("\nBoth Points are not equal");
							System.out.println("Distance : "+ points[num1].calculateDistance(points[num2]));
							System.out.println("____________________");
						}
						
					}
					else 
					{
						System.out.println("Such 2nd index doesn't exist... Please try again");
						System.out.println("____________________");
					}
					
					
				}
				else 
				{
					System.out.println("Such 1st index doesn't exist... Please try again");
					System.out.println("____________________");
				}
					
				
				break;
				
			default:
				System.out.println("Wrong choice...Please try again");
				System.out.println("____________________");
				break;
			}
			
			
			
		}while(choice != 0);
				
		
		
		sc.close();
	}

}
