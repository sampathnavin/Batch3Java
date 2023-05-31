package Day22;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CollectionPart3 {

	public static void main(String[] args) {
		
		// What is a List ?
		
			// List is a Interface - Which has Array List and Linked List Classes
		
			// It maintains insertion order 
		
			// Duplicates are allowed in Both Array List and Linked List 
		
		
		// What is Set ?
		
			// Set is a Interface - Which has Hasshset and Linked Hashsetset Classes 
		
			// Hash Set is a class 
		
			// It will not allow you Duplicates 
		
			// Insertion order is not maintained 
		
			// Will not have get index methods of 
		
		HashSet<String> se = new HashSet<String>();
		
		se.add("Java");
		se.add("Java");
		se.add("Python");
		se.add("Ruby");
		se.add("Selenium");
		se.add("Java");
		se.add("java");
		
		for(String b: se)
		{
			System.out.println(b);
		}
		
		System.out.println(se.size());
		
		System.out.println(se.contains("java"));
		
		
		LinkedHashSet<Object> le = new LinkedHashSet<Object>();
		
		le.add("Selenium");
		le.add(12345);
		le.add(true);
		le.add('c');
		le.add("Java");
		le.add("Python") ;
		le.add("Java");
		
		for(Object c: le)
		{
			System.out.println(c);
		}
		
		// LinkedHashSet 
		
		// It will not allow you duplicates 
		
		// It will maintain Insertion order 
		
		// Will not have get index methods of 

		
		
		
		

	}

}
