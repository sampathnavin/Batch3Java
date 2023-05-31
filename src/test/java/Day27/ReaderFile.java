package Day27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReaderFile {

	public static void main(String[] args)  {
		
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\JavaTrainingBatch3\\src\\test\\resources\\dummy.txt");
		
		try {
			FileReader fr = new FileReader(f);
		
			Scanner s = new Scanner(f);
			
			if(s.hasNextLine())
			{
				System.out.println(s.nextLine());
			}
			else
			{
				System.out.println("Java Class Is COmpletes");
			}
			
			s.close();
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
