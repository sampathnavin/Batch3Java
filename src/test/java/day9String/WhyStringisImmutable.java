package day9String;

import java.util.Scanner;

public class WhyStringisImmutable {

	public static void main(String[] args) {
		
		String FirstName = "Navin" ;
		String MiddleName = "Kumar" ;
		String LastName = "Sampath" ;

	//  Why string is immutable ??	
		
		// Strings cannnot be replaced or muted (Once it is created its created)
		// Strings uses a concepts called string pool which objects are created 
		// Whenever we do some replacement new memory is not assigned 
		// Only mapping for the variable name is getting changed 

		
		
		/*
		 * Scanner s = new Scanner(System.in);
		 * 
		 * String p = s.next();
		 */
		
		System.out.println("Your Full Name is " +FirstName+ " " +MiddleName + " " + LastName);
		
		int p = 100 ;
		p = 101 ;
		
		String WhatClass = "JAVA" ;
		String CurrentClass = "java" ;
		
		// What data type it will return ??	
		System.out.println(WhatClass.equals(CurrentClass));
		
		// Ignoring Case Sesnsitive ??
		
		System.out.println(WhatClass.equalsIgnoreCase(CurrentClass));
		
		
		
		
		
		
		
		
		
	}

}
