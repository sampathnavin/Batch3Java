package Day26;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionVsCollections {
	
	//  Collection - Collection is a interface 
	
	// Collections - Collections is class which will help us to do some modications 

	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		marks.add(90);
		marks.add(30);
		marks.add(110);
		marks.add(50);
		
		for(int i = marks.size()-1 ; i>=0 ; i-- )
		{
			System.out.println(marks.get(i));
		}
		
		
		Collections.reverse(marks);
		
		System.out.println("*****************");
		
		for(Integer e : marks)
		{
			System.out.println(e);
		}
		
		System.out.println("*****************");
		
		Collections.sort(marks);
		
		
		for(Integer e : marks)
		{
			System.out.println(e);
		}
		
		
		// Add 
		
		// 15 ,13,14,,7,,8,5,9,10,11,4,3,1,2,0
		
		// in a array list 
		
		// i want u guys to print in descending order 
		
		// u have to use Collections and for loop to achieve it 
		
		
		
	}

}
