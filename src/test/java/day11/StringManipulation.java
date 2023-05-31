package day11;

public class StringManipulation {

	public static void main(String[] args) {
	
		String Fullname1 = "Navin Kumar Sampath" ;
							// 0	1    2
		
		System.out.println(Fullname1);
		
	// My requirement is to split First Name Middle name last name 
	
		String[] Fullname = Fullname1.split(" ");
		
		System.out.println(Fullname[0]);
		System.out.println(Fullname[1]);
		System.out.println(Fullname[2]);
		
		System.out.println("*********");
		
		for(String i : Fullname)
		{
			System.out.println(i);
		}
		
		
		
		
		
		

	}

}
