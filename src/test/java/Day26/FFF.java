package Day26;

public class FFF {
	
	
	// FFF Means 
	
	//  Final - Final is fixed values it cannot be overriden 
	
	// Finally  - Finally is used in exception handling with try catch - Fianlly will run whether try or catch 
	
	// Finalize - Is used as a garbage collector which will collect all the null values and reduce memory and increase the performance
	
	int pp ;
	
	int cc ;
	
	String oo = null ;
	
	final int n = 10 ;
	
	public int p = 20 ;
	
	
	public void div()
	{
		try 
		{
			int a = 10 ;
			int b = 0 ;
			int c = a+b ;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("Enter proper numbers");
		}
		
	}
	
	

	public static void main(String[] args) {
		
		FFF f = new FFF();
		f.p =30 ;
		System.out.println(f.p);
		System.out.println(f.n);
		f.div();
		
		// Garbage Collector is being called 
		
		System.gc();

	}

}
