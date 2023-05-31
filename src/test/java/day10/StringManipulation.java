package day10;

public class StringManipulation {

	public static void main(String[] args) {
		
		String date = "06-04-2023" ;
		
		System.out.println(date);
		
		// Date needs to be displayed as 06/04/2023
		
		String newupdtaeddate = date.replace('-', '/');
		
		System.out.println(newupdtaeddate);
		
		String s = "NAVIN" ;
			//		01234
					
		String p = "SAMPATH" ;
				//	0123456
		
		String sp = "Navin Sampath";
			//		 0123456789012 	
		System.out.println(sp.length());
		
		System.out.println(sp.indexOf(' '));
		
		int size = s.length();
		
		System.out.println(size);
		
		System.out.println(s.indexOf('I'));
		
		
		String s1 = "java selenium" ;
				//   0123456789012	
		String s2 = "java" ;
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.contains("sel"));
		
		// Substring 
		
		System.out.println(s1.substring(0, 4));
		
		System.out.println(s1.substring(5, 13));
		
		
		

		
		
			
		

	}

}
