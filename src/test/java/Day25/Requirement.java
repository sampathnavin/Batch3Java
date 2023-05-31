package Day25;

import java.util.Scanner;

public class Requirement {
	
	// A user who doesnt know anything about the world he is withdrwing an 
	//  ammount which is greater than his balance 
	
	// He should receive an Message saying that enter less amount 
	
	int bal = 1000 ;
	
	public int debit()
	{
		System.out.println("Enter Amount that needs to be debited");
		Scanner s = new Scanner(System.in);
		int with = s.nextInt() ;
		
		try
		{
			if(with>bal)
			{
				throw new InsufficientExcpetion(with-bal);
			}
		}
		catch (InsufficientExcpetion e)
		{
			System.out.println(e);
		}
		
		
		
		return with-bal ;
	}
	
	

}
