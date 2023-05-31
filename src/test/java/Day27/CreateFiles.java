package Day27;

import java.io.File;
import java.io.IOException;

public class CreateFiles {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\JavaTrainingBatch3\\src\\test\\resources\\dummy.txt");

		try {
			if(f.createNewFile())
			{
				System.out.println("File Created");
			}
			else
			{
				System.out.println("File Already Created");
			}
		} catch (IOException e) {

			System.out.println(e);
		}
	}

}
