/*
 2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
doubles, supply suitable error message & terminate.
If numbers are double values, print its average.
Hint : Check Scanner class for the methods
 **/



import java.util.Scanner;

public class Check_double_Program {

	public static void main(String[] args) 
	{
		

		Scanner sc = new Scanner(System.in);
				
		double num1,num2, avg;
				
		System.out.println("Enter 1st double number : ");
			
				
		if(sc.hasNextDouble())				
		{
			num1 = sc.nextDouble();
					
					
			System.out.println("Enter 2nd Double number : ");	
					
					
			if(sc.hasNextDouble())
			{
				num2 = sc.nextDouble();
						
				avg = (num1+num2)/2;
						
				System.out.println("Average : "+avg);
						
				}else
				{
					System.out.println("Num2 is Not double");
				}
					
			}
			else
			{
				System.out.println("Num1 is Not double");
			}
			
			
		sc.close();
	}

	
		

}

