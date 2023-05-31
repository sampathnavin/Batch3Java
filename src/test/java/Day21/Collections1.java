package Day21;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collections1 {

	public static void main(String[] args) {
		
		
		
		
		String[] names= {"Aishwaya", "Chetan", "Gowthami" , "Jayshree" , "John", "Menakshi" , "Nandhni" , "Navin" ,"Raj Kumar" ,"Ranjith","Sanjay", "Sindhuja" , "Suganya"};
		
		System.out.println(names.length);
		// System.out.println(names[0]);
		
		for(String a : names)
		{
			System.out.println(a);
		}
		
		// Drawbacks of Array
		
		// Fixed Size we cant increase the size 
		// Collection - Is a Interface 
		//  Three Interfaces 
		// List , Set , Map - Interface 
		
		
		// Collection : Collection of Strings, Integer, Char are said be collection 
		
		// We can increase the size gradually 
		// No fixed size 
		
		// List Interface ,
		
		// ArrayList  (Class)
		
		// Linked List (Class)
		
		// Defining the Array List 
		
		System.out.println("*************");
		
		ArrayList<String> namescollction = new ArrayList<String>();
		
		namescollction.add("Aishwarya");
		namescollction.add("Chetann");
		namescollction.add("Gowthami");
		namescollction.add("Jayshree");
		namescollction.add("John");
		namescollction.add("Menakshi");
		namescollction.add("Menakshi");
		namescollction.add("Arun");
		
		for(String b: namescollction)
		{
			System.out.println(b);
		}
		
		// To add all string , int , char in collection it is going to support
		
		ArrayList<Object> coll = new ArrayList<Object>();
		coll.add("Java") ;
		coll.add(123);
		coll.add('c');
		coll.add(true);
		
		for(Object a : coll)
		{
			System.out.println(a);
		}
		
		// In backend linked data structue is used which will speed up retrieving datas from indexx 
		
		LinkedList<String> subjects = new LinkedList<String>();
		subjects.add("Java");
		subjects.add("Python");
		subjects.add("Ruby");
		
		
		System.out.println(coll.get(2));
		
		System.out.println("*********************************");
		
		namescollction.contains("Chetan");
		
		
		
		
		
	}

}
