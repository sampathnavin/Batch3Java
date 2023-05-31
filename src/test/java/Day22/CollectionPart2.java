package Day22;

import java.util.ArrayList;

public class CollectionPart2 {

	public static void main(String[] args) {
		
		// Methods Available in array/linked list 
		
		// Array/Linked List will always Maintain Insertion order / Index Value 
		
		ArrayList<String> namescollction = new ArrayList<String>();
		
		namescollction.add("Aishwarya");
		namescollction.add("Chetann");
		namescollction.add("Gowthami");
		namescollction.add("Jayshree");
		namescollction.add("John");
		namescollction.add("Menakshi");
		namescollction.add("Arun");
		
		for(String b: namescollction)
		{
			System.out.println(b);
		}
		
		System.out.println("**********");
		// Remove an Object 
		
		namescollction.remove("Arun");
		
		for(String b: namescollction)
		{
			System.out.println(b);
		}
		
		System.out.println("**********");
		
		System.out.println(namescollction.contains("John"));
		
		System.out.println(namescollction.get(2));
		
		System.out.println(namescollction.indexOf("John"));
		
		System.out.println(namescollction.size());

	}

}
