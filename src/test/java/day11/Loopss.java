package day11;

public class Loopss {

	public static void main(String[] args) {
		
		String name1 = "Aishwarya" ;
		String name2 = "Chetan" ;
		String name3 = "Gowthami" ;
		String name4 = "Jayshri" ;
		String name5 = "John" ;
		String name6 = "Mani" ;
		String name7 = "Menakshi" ;
		String name8 = "Nandhini" ;
		String name9 = "Navin" ;
		String name10 = "Raj" ;
		String name11 = "Sanjay" ;
		String name12 = "Sathya" ;
		String name13 = "Sindhuja" ;
		String name14= "Suganya";
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
		System.out.println(name8);
		System.out.println(name9);
		System.out.println(name10);
		System.out.println(name11);
		System.out.println(name12);
		System.out.println(name13);
		System.out.println(name14);
		
		// Options to create all these in a single array 
		
		// Collection of similar data type 
		// Int array, String array , char array 
		// Arrays are fixed size 
				
		String[] name = {"Aishw", "Chetan" , "Gowthami", "Jayshri" };
				
		
		//  Enhanced for Loop 
		
		// Iteration - One By One 
		
		System.out.println("**********");
		
		for(String a : name)
		{
			System.out.println(a);
		}
		
	}

}
