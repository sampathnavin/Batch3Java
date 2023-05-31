package day24;

import java.util.Scanner;

public class ExceptionHandleMethods {
	
	// Exception - Error that we will face while executing a program 
	
	// To handle this exception - we are going to use try catch methods 
	
	public void div()
	{
		
		try {
		int i = 10 ;
		int p = 0 ;
		int c = i / p ;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	
	public void sum()
	{
		int i = 10 ;
		
		int p = 20 ;
		
		int c = i + p ;
		
		System.out.println(c);
	}
	
	public void sub()
	{
		int i = 10 ;
		
		int p = 20 ;
		
		int c = i - p ;
		
		System.out.println(c);
	}
	
	
	public void mul()
	{
		int p = 0 ;	
		int c = 0 ;
		
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the  First Number");
			p = s.nextInt();
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
		try {	
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the  Second Number");
			c = s1.nextInt();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			int a = p*c;
			System.out.println("The Multiplied Number is" +a);
		}
		
			
			
			
		
	}
	


