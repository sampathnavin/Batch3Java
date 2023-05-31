package day23;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Mapss {

	public static void main(String[] args) {
		
		//  Maps - Interface 
		
		// HashMap  -  Class
		
		// Linked Hash Map  - Class
		
		 
		// Y we are going for maps ??
		
		
		// Navin   - 450
		
		// Chetan  - 460
		
		// Nandhini - 470
		
		// Suaganya - 476
		
		// John - 	478 
		
		// Jeyahsreee - 479
		
		
		LinkedList<String> names = new LinkedList<String>();
		
	names.add("navin");
	names.add("Chetan");
	names.add("Nandhini");
	names.add("Suagnya");
	names.add("John");
	names.add("Jeyshree");
	
	LinkedList<Integer> Marks = new LinkedList<Integer>();
	Marks.add(450);
	Marks.add(455);
	Marks.add(433);
	Marks.add(460);
	Marks.add(490);
	Marks.add(479);
	
		
	//  I want u guys to print My name is ---- and My Total Marks is --
	
	
	for(int i = 0 ; i < names.size() ; i++)
	{
		System.out.println("My Name is " +names.get(i) + "and My Total Marks is " +Marks.get(i));
	}
	
	
	System.out.println("*****************************");
	//  Maps - It will allow u to save in Keys and value format
	
	//  Hash Map - is an unodered list
	
	// Keys will not allow u duplicate values
	// Values will allow u duplicate values 
	
	HashMap<String, Integer> details = new HashMap<String, Integer>();
	
	details.put("Navin", 450);
	details.put("Chetan", 460);
	details.put("Jeyshre", 470);
	
	for(String c : details.keySet())
	{
		System.out.println("My name is" +c +"and my total marks scored is " + details.get(c) ) ;
	}
	
	
	// Linked Hash Map -  It is a class 
	
	// It will save in ordered list 
	
	// It uses doubl linked data struture list the prrogress it will be speed
		
	System.out.println("*****************************");

	LinkedHashMap<String, Integer> markslist = new LinkedHashMap<String, Integer>();
	
	markslist.put("Science", 90);
	markslist.put("Social", 80);
	markslist.put("Maths", 98);
	markslist.put("Tamil", 87);
	markslist.put("English", 80);
	System.out.println("*****************************");

	
	for(String g : markslist.keySet())
	{
		System.out.println("Marks Scored in " +g + "is" + markslist.get(g));
	}
	
	markslist.remove("Science"); 
	
	
	for(String g : markslist.keySet())
	{
		System.out.println("Marks Scored in " +g + "is" + markslist.get(g));
	}
	}

}
