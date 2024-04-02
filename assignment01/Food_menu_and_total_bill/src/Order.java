/*
 * 
 Display food menu to user. User will select items from menu along with the quantity. (e.g 1. Dosa
2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.
(No need of any class, and no need to display the food details. Only display the total of ordered
food)

*/

import java.util.Scanner;


public class Order {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int choice;
		int quantity;
		int sum=0;



		Scanner sc = new Scanner (System.in);
		
		
		
		do
		{
			
			System.out.println("\nEnter 0 for EXIT ");
			System.out.println("Enter 1 for Dosa ");
			System.out.println("Enter 2 for Samosa ");
			System.out.println("Enter 3 for Idli ");
			System.out.println("Enter 4 for Vada Pav ");
			System.out.println("Enter 5 for Maggie ");
			System.out.println("Enter 6 for Cake ");
			System.out.println("Enter 7 for Ice-Cream ");
			System.out.println("Enter 8 for Dhokla ");
			System.out.println("Enter 9 for Kachori ");
			System.out.println("Enter 10 for Total Bill\n");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			
			switch(choice)
			{
			case 1:
				System.out.println("Price of Dosa : Rs.30 ");
				System.out.println("Enter your quantity : ");
				quantity = sc.nextInt();
							
				sum = sum + quantity * 30;
				break;
				
				
				
			case 2:
				System.out.println("Price of Samosa : Rs.25 ");
				System.out.println("Enter your quantity : ");
				quantity = sc.nextInt();
				
							
				sum = sum + quantity * 25;
				break;
				
				
				
				
			case 3:
				System.out.println("Price of Idli : Rs.25 ");
				System.out.println("Enter your quantity : ");
				quantity = sc.nextInt();
								
				sum = sum + quantity * 25;
				break;
				
				
				
				
			case 4:
				System.out.println("Price of Vada Pav : Rs.15 ");
				System.out.println("Enter your quantity : ");
				quantity = sc.nextInt();				
				
				sum = sum + quantity * 15;
				break;
				
				
				
				
			case 5:
				System.out.println("Price of Maggie : Rs.30 ");
				System.out.println("Enter your quantity : ");
				quantity = sc.nextInt();
								
				sum = sum + quantity * 30;
				break;
				
				
				
			case 6:
				System.out.println("Price of Cake : Rs.100 ");
				System.out.println("Enter your quantity : ");
				quantity = sc.nextInt();
								
				sum = sum + quantity * 100;
				break;
				
				
				
			case 7:
				System.out.println("Price of Ice-cream : Rs.40 ");
				System.out.println("Enter your quantity : ");
				quantity = sc.nextInt();	
				
				sum = sum + quantity * 40;
				break;
				
				
				
			case 8:
				System.out.println("Price of Dhokla : Rs.35 ");
				System.out.println("Enter your quantity : ");
				quantity = sc.nextInt();
				
				sum = sum + quantity * 35;
				break;
				
				
				
				
			case 9:
				System.out.println("Price of Kachori : Rs.25 ");
				System.out.println("Enter your quantity : ");
				quantity = sc.nextInt();
								
				sum = sum + quantity * 25;
				break;
				
				
				
			case 10:
				System.out.println("Your total bill : "+sum);
				
				break;
				
				
			default:
				System.out.println("Wrong choice...please try again..");
				break;
				
				
				
			case 0:
				System.out.println("Thank You....");
						
			
			
			
			
			}
			
			
			
			
		}while(choice != 0);
		
		
		
		
		sc.close();	

	}

}