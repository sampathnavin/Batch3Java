package Day25;

public class ThrowVsThrows {
	
	// Throws - Throws are Inbuild exceptions which will be given by JAVA 
	
	// Arithmetic
	// Index out of bound exception
	// Input mismatch exceptions 
	
	// Throws - will not allow you to execute the next code if you are having an exception
	
	//  Throw - It is a user defined Exception 
	
	public int div ()
	{
		int a = 10 ;
		int b = 0 ;
		
		int c = a/b ;
		
		return c ;
	}

	public static void main(String[] args) {
		ThrowVsThrows tt = new ThrowVsThrows();
		tt.div();
		System.out.println("***************");
	
		

	}

}
