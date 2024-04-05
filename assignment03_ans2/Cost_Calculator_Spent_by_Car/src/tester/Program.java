package tester;


import com.sunbeam.CostSpent;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Cost Calculator");
		
		CostSpent c1 = new CostSpent();
		c1.acceptDetails();
		c1.displayDetails();
		c1.calculateCost();
		
		System.out.println("\nThank You for using Cost Calculator");
		
		
		

	}

}
