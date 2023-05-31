package day8;

import java.util.Scanner;

public class ScannerMethods {
	
	//Method 
	
	// Ur assignements use Scanner in all the methods and work for it 
	
	public void subtraction()
	{
		// Scanner Class 
		 // Getting input from the user through our console 
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a = s.nextInt();
		System.out.println("Enter the Second Number");
		int b = s.nextInt() ;
		int c = a-b ;
		System.out.println("The Subtraction for the given number is" + c);
		
	}

}
