package Day27;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {

	public static void main(String[] args) {
		//File 
		//File Writer 
		// File Reader are inbuild java class 
		
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\JavaTrainingBatch3\\src\\test\\resources\\dummy.txt");
		

			FileWriter fw;
			try {
				fw = new FileWriter(f);
				fw.write("This is the First piece of code");
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
	}

}
