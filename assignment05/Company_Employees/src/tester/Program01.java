package tester;

import java.util.Scanner;

import com.company.*;

public class Program01 {

	public static void main(String[] args) 
	{
		
		Employee e = null;
		
		
//		e1 = new SalariedEmployee();
//		e1.acceptData();
//		e1.displayData();
//		
//		Employee e2 = new HourlyEmployee();
//		e2.acceptData();
//		e2.displayData();
//		e2.calculateTotalSalary();
//		
//		Employee e3 = new CommissionEmployee();
//		e3.acceptData();
//		e3.displayData();
//		e3.calculateTotalSalary();
//		
//		Employee e4 = null;
//		BasePlusCommissionEmployee b = null;
//		
//		
//		e4 = new BasePlusCommissionEmployee(); //upcasting
//		
//		
//		if(e4 instanceof BasePlusCommissionEmployee) //checking for downcasting
//		{
//			b = (BasePlusCommissionEmployee)e4; //downcasting
//			b.acceptData();
//			b.displayData();
//			b.incrementSalary();
//		}
//		else 
//		{
//			b.acceptData();
//			b.displayData();
//			b.calculateTotalSalary();
//			
//		}
		
	Scanner sc = new Scanner(System.in);	
		
	int choice;	
		
	System.out.println("\nEnter 1 for Salaried Employee");
	System.out.println("Enter 2 for Hourly Employee");
	System.out.println("Enter 3 for Commission Employee");
	System.out.println("Enter 4 for Base Plus Commission Employee");
	
	System.out.println("Enter your choice");
	choice = sc.nextInt();
	
	if(choice == 1)
	{
		e = new SalariedEmployee();
		e.acceptData();
		e.displayData();
		
	}
	else if(choice == 2)
	{
		e = new HourlyEmployee();
		e.acceptData();
		e.displayData();
		e.calculateTotalSalary();
		
	}
	else if(choice == 3) 
	{
		e = new CommissionEmployee();
		e.acceptData();
		e.displayData();
		e.calculateTotalSalary();
		
	}
	else if(choice == 4)
	{
		e = new BasePlusCommissionEmployee();
		
		BasePlusCommissionEmployee b = null;
		
		if(e instanceof BasePlusCommissionEmployee)
		{
			b = (BasePlusCommissionEmployee)e ;
			
			b.acceptData();
			b.displayData();
			b.incrementSalary();
		}
		else
		{
			b.acceptData();
			b.displayData();
			b.calculateTotalSalary();
			
		}
	}
	else
	{
		System.out.println("Wrong choice... try again");
	}
	
		
		
		
		

	}

}
