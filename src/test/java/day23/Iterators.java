package day23;

import java.util.HashSet;
import java.util.Iterator;

public class Iterators {

	public static void main(String[] args) {
		
		// To save Mail ID 
		
		HashSet<String> mailid = new HashSet<String>();
		mailid.add("aishuwaraya2000@gmail.com");
		mailid.add("jayashreehm2000@gmail.com");
		mailid.add("suganyarajani@gmail.com");
		mailid.add("ammuravi50@gmail.com");
		mailid.add("grk5320@gmail.com");
		mailid.add("manigandansoft1998@gmail.com");
		mailid.add("nagananthinimcatce@gmail.com");
		mailid.add("meenakshinagarajan1695@gmail.com");
		
		
		// Iterator - One by One  - Interface
		
		Iterator<String> i = mailid.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
