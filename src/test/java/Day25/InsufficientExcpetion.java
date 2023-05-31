package Day25;

public class InsufficientExcpetion extends Exception {
	
	int amt ; 
	
	public InsufficientExcpetion(int amount)
	{
		amount = amt ;
		System.out.println("Enter Less Amount");
	}
}
