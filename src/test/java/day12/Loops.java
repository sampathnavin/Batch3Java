package day12;

public class Loops {

	public static void main(String[] args) {
		
		// My req is to print 1 to 5 
		
		int a = 1 ;
		int b = 2 ; 
		int c = 3 ;
		int d = 4 ;
		int e = 5 ;
		
		System.out.println("A Known Concept");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println("Second Option using enhanced for Loop");
		
		int [] a1 = {1,2,3,4,5};
		
		for(int a2 : a1)
		{
			System.out.println(a2);
		}
		
		// For Giving conditions we will be using traditional for loops
		
		// Traditional For Loop 
		
		//  Declaring 
		// Condition 
		// Increment or Decrement 
		
		// My req is to print 1 to 5 
		
		System.out.println("Using Traditional For Loops");
		
		for(int w = 1 ; w<=1000 ; w++)
		{
			System.out.println("w");
		}
		
		// You have a req to print 10 in a decending order 
		
		for(int qw = 10 ; qw>=1 ; qw--)
		{
			System.out.println(qw);
		}
		
		
}
}