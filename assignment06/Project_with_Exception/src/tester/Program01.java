package tester;

import java.util.Scanner;

import com.sunbeam.WriteLine;

public class Program01 {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
			WriteLine wl = new WriteLine();
			
			
			try
			{
				wl.acceptString();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally {
				sc.close();
			}
			
			
	}

}
