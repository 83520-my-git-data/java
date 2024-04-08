package main;

import com.app.fruits.*;
import java.util.Scanner;

enum caseMenu 
{
	EXIT, APPLE, MANGO, ORANGE, ALLNAME, ALLDETAILS, TASTEOFSTALE, FRESHTONOTFRESH, SOURTOSTALE
}

public class Program01 {

	public static void main(String[] args) {
		
		int counter = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Basket size in number");
	
		
		Fruit basket[] = new Fruit[sc.nextInt()];
		
		Fruit f;
		
		caseMenu fruitChoice;
		
		do
		{
			System.out.println("Enter 0 for EXIT");
			System.out.println("Enter 1 for Add Apple");
			System.out.println("Enter 2 for Add Mango");
			System.out.println("Enter 3 for Add Orange");
			System.out.println("Enter 4 for Display all fruits in basket");
			System.out.println("Enter 5 for Display details of all fruits ");
			System.out.println("Enter 6 for Display taste of all stale fruits ");
			System.out.println("Enter 7 to mark fruit as stale");
			System.out.println("Enter 8 for mark all sour fruit as stale");
			
			System.out.print("Enter Your Choice : ");
			
			fruitChoice = caseMenu.values()[sc.nextInt()];
			
			switch (fruitChoice) 
			{
			case EXIT:
				System.out.println("Thank You....");
				
			case APPLE:
				
				f = new Apple();
				
				if (counter != basket.length) 
				{
					System.out.println("Is Apple Fresh");
					f.setFresh(sc.nextBoolean());

					basket[counter++] = f;
					
					System.out.println("-------------------------------------------------");
					System.out.println(basket[counter - 1].getName() + " Added to Basket");
					System.out.println("-----------------------------------------------\n");
				} 
				else {
					System.out.println("-------------------------------------------------");
					System.out.println("Basket is Full");
					System.out.println("-----------------------------------------------\n");
				}

				break;
				
			case MANGO:
				
				f = new Mango();
				
				if (counter != basket.length) 
				{
					System.out.println("Is Mango Fresh");
					f.setFresh(sc.nextBoolean());

					basket[counter++] = f;
					
					System.out.println("-----------------------------------------------------------------------");
					System.out.println(basket[counter - 1].getName() + " Added to Basket");
					System.out.println("-----------------------------------------------------------------------\n");
				} 
				else {
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("Basket is Full");
					System.out.println("-----------------------------------------------------------------------\n");
				}

				break;
				
			case ORANGE:
				
				f = new Orange();
				if (counter != basket.length) 
				{
					System.out.println("Is Orange Fresh");
					f.setFresh(sc.nextBoolean());

					basket[counter++] = f;
					
					
					System.out.println("-------------------------------------------------------------");
					System.out.println(basket[counter - 1].getName() + " Added to Basket");
					System.out.println("------------------------------------------------------------\n");
				} 
				else {
					System.out.println("--------------------------------------------------------------");
					System.out.println("Basket is Full");
					System.out.println("------------------------------------------------------------\n");
				}

				break;
				
				
			case ALLNAME:
				
				if (counter != 0) 
				{
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("Names of Fruits in Basket are :\n");
					
					for (int i = 0; i <= basket.length - 1; i++) 
					{
						if (basket[i] == null)
							break;
						
						System.out.println(basket[i].getName());
					}
					
					System.out.println("-----------------------------------------------------------------------");
				} 
				else 
				{
					System.out.println("Basket is Empty");
				}
				break;
				
				
				
				
			case ALLDETAILS:
				if (counter != 0) 
				{
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("Attributes and Taste of Fruits in Basket are :\n");
					
					for (int i = 0; i <= basket.length - 1; i++) {
						if (basket[i] == null)
							break;

						System.out.printf(basket[i].toString());
						
						System.out.println("\nTaste of " + basket[i].getName() + " : " + basket[i].taste() + "\n");
					}
					
					System.out.println("-----------------------------------------------------------------------");
				} 
				else 
				{
					System.out.println("Basket is Empty");
				}
				break;
				
				
				
				
			case TASTEOFSTALE:
				if (counter != 0) 
				{
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("Taste of all Stale Fruits in Basket are :\n");
					
					for (int i = 0; i <= basket.length - 1; i++) 
					{
						if (basket[i] == null)
							break;
						
						if (!basket[i].isFresh())
							System.out.printf("\nTaste of " + i + " index " + basket[i].getName() + " : "
									+ basket[i].taste() + "\n");
					}
					
					System.out.println("-----------------------------------------------------------------------");
				} 
				else 
				{
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("Basket is Empty");
					System.out.println("-----------------------------------------------------------------------\n");
				}
				break;
				
				
				
				
			case FRESHTONOTFRESH:
				if (counter != 0) 
				{
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("Enter Index of Fresh Fruit to mark as Not Fresh : ");
					
					int n = sc.nextInt();
					
					if (n <= basket.length - 1) 
					{
						for (int i = n; i <= basket.length - 1; i++) 
						{
							if (basket[i] == null)
								break;
							
							if (basket[i].isFresh())
							{
								basket[i].setFresh(false);
								break;
							}
							System.out.println("-----------------------------------------------------------------------");
							System.out.println(basket[i].getName() + " Status Changed to Not Fresh\n");
							// System.out.println("---------------------------------------------------------------------\n");
						}
					} 
					else {
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("Invalid Index");
						// System.out.println("---------------------------------------------------------------------\n");
					}
					System.out.println("-----------------------------------------------------------------------");
				} else {
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("Basket is Empty");
					System.out.println("-----------------------------------------------------------------------\n");
				}
				break;
				
				
				
				
				
				
			case SOURTOSTALE:
				
				if (counter != 0) 
				{
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("Taste of all Stale Fruits in Basket are :\n");
					
					for (int i = 0; i <= basket.length - 1; i++) 
					{
						if (basket[i] == null)
							break;
						
						String taste = basket[i].taste();
						
						int index = taste.indexOf("Sour");
						
						if (index != -1) 
						{
							basket[index].setFresh(false);
							
							System.out.println("-----------------------------------------------------------------------");
							System.out.println(basket[i].getName() + " Status Changed to Not Fresh");
							
						}
					}
					
					System.out.println("-----------------------------------------------------------------------");
				} 
				else 
				{
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("Basket is Empty");
					System.out.println("-----------------------------------------------------------------------\n");
				}
				break;
				
				
				
				
			
			
			
			
			
			
			
			
			
			}
			
			
			
		}while(caseMenu(fruitChoice)!= 0);
 
	}

}
