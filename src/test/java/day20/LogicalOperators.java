package day20;

public class LogicalOperators {
	
	// What are logical Operators ??
	
	// && , || , !=
	
	
	// && 
	
	/*
	 * T T - T 
	 * T F - F 
	 * F T - F 
	 * F F - F
	*/
	
	// || 
	
	/*
	 * 
	 * T T - T 
	 * T F - T 
	 * F T - T 
	 * F F - F
	 * 
	*/
	
	// Age should be lesser than 18 
	// Your height should be > 5 ft 
	
	
	// Assignement 
	
	// Use Scanner 
	// Adhar card need tbe = 16 digits 
	// your nationality should be india 
	// your age should be greater than 18  - You are eligible for this JOB 
	
	public void check()
	{
		int age = 18 ;
		int height = 5 ;
		
		int userage = 17 ;
		int userheight = 4 ;
		
		if(userage<=age && userheight>=height)
		{
			System.out.println("You are eligible");
		}
		else 
		{
			System.out.println("You are not eligible");
		}
		
	}
	
	

	public static void main(String[] args) {
		
		
		LogicalOperators lo = new LogicalOperators();
		
		lo.check();
		

	}

}
