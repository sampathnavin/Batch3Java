package day14;

public class PolyMorphism {
	
	// Poly - Many 
	
	// Polymorphism - One to Many 
	
	// Polymorhism - Is divided into two types 
	
	// Method Overloading - Static Polymorphism - Compile time polymorphism 
	
	 // Overloading  - Passing arguments to the method is said as overloading 
	
	
	// Method overloading - having same method name with diff arguments passing to the method
	//  is said as method overloading 
	
	
	public void add()
	{
		int a = 10 ;
		int b = 13 ;
		int c = a +b ;
		System.out.println(c);
	}
	
	public void add(int a, int b)
	{
		int c = a +b ;
		System.out.println(c);
	}
	
	public void add (String a , String b)
	{
		
	}
	
	public void add(int x, int v, int d)
	{
		int z = x + v +d ;
		System.out.println(z);
	}
	
	
	// Overloaded Method 
	
	public int sub(int a , int b)
	{
		int c = a -b ;	
		//System.out.println(c);
		// return c;
		return c;
	}
	

}
