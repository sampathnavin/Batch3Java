package day11;

public class ControlStatement {

	public static void main(String[] args) {
		
		
		// What is control statement ?
		
		//  Options//Alternative ways 
		
		// IF ELSE IF AND ELSE 
		
		int Zoology = 200 ; 
		int Botany = 200 ;
		int physics = 200 ; 
		int chemistry = 200 ;
		int Mathematics = 200 ;
		int computersciene = 200 ;
		int cutoffMBBS = Zoology + Botany + physics + chemistry /4 ;
		int cutoffEngin = Mathematics + physics + chemistry + computersciene /4 ;
		
		//  if my cut off is >199 i am going to get a doctor option
		//  if my cut off in enginer > 199 i wiill be get a anna university seat 
		//  Else my cut off is <199 i am going to get engineering 
		
		
		if(cutoffMBBS >199)
		{
			System.out.println("You are selected to MBBS");
		}
		else if (cutoffEngin >199 )
		{
			System.out.println("You are selected to Anna University");
		}
		else 
		{
			System.out.println("You are selected to BE");
		}
		
		
		
		

	}

}
