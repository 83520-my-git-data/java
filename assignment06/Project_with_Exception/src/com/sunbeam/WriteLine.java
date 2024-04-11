package com.sunbeam;

import exceptions.ExceptionLineTooLong;

import java.util.Scanner;

public class WriteLine {

	private String line;

	Scanner sc = new Scanner(System.in);

	public void acceptString() throws ExceptionLineTooLong
	{
		System.out.println("Write a line");
		line = sc.nextLine();

			if (line.length() > 80) 
			{
				throw new ExceptionLineTooLong("Out of limit(more than 80)", "characters");
			}
			else 
			{
				System.out.println( toString() );
			}
		
	}

	@Override
	public String toString() 
	{
		return "Line : " + line;
	}

}
