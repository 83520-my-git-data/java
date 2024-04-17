package tester;

import com.sunbeam.Students;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Program {
	
	
	
	
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		
		Students[] arr1 = null;
		
		
		int choice;
//		int index;
		
		do {
			
			System.out.println("Enter 0 for EXIT");
			System.out.println("Enter 1 for accept students");
			System.out.println("Enter 2 for display all students");
			System.out.println("Enter 3 for students sort based on name");
			System.out.println("Enter 4 for students sort based on marks");
			System.out.println("Enter 5 for students sort based on city");
			choice = sc.nextInt();
			
			
			switch(choice)
			{
			case 0:
				System.out.println("Thank You...");
				break;
				
			case 1:
				
				System.out.println("Enter no.of students required : ");
				int num = sc.nextInt();
				
				 arr1 = new Students[num];
				 		 
								
				for(int i=0; i<arr1.length; i++)
				{
					
					arr1[i]= new Students();
					arr1[i].accept();
					System.out.println("=======================");
				}
				
				break;
				
				
				
				
			case 2:
				for(Students element : arr1)
				{
					System.out.println(element);  //arr1.toString()
					System.out.println("=======================");
				}
								
				break;
				
			case 3:
				
				class NameSortStudents implements Comparator<Students>
				{

					@Override
					public int compare(Students o1, Students o2) 
					{
						return o1.getName().compareTo(o2.getName());
					}
					 
					
				}
				
				NameSortStudents nameSortStudents = new NameSortStudents();
				
				Arrays.sort(arr1, nameSortStudents);
				
				for (Students students : arr1) {
					System.out.println(students);
					System.out.println("=======================");
				}
				
				break;
				
			case 4:
				
				class MarksSortStudents implements Comparator<Students>
				{

					@Override
					public int compare(Students o1, Students o2) 
					{
						int value = (int) (o2.getMarks() - o1.getMarks()) ;
						return value;
					}
					 
					
				}
				
				MarksSortStudents marksSortStudents = new MarksSortStudents();
				
				Arrays.sort(arr1, marksSortStudents);
				
				for (Students students : arr1) {
					System.out.println(students);
					System.out.println("=======================");
				}
				
				break;
				
				
			case 5:
				
				class CitySortStudents implements Comparator<Students>
				{

					@Override
					public int compare(Students o1, Students o2) 
					{
						return o1.getCity().compareTo(o2.getCity());
					}
					 
					
				}
				
				CitySortStudents citySortStudents = new CitySortStudents();
				
				Arrays.sort(arr1, citySortStudents);
				
				for (Students students : arr1) {
					System.out.println(students);
					System.out.println("=======================");
				}
				break;
			
			
			
			}
			
			
			
		} while (choice != 0);
		
		sc.close();
		
		
		
		
		
		
		
		

	}

}
