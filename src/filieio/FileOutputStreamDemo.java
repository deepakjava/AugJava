package filieio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		try {
			//1. Open the Stream
			FileOutputStream fout = new FileOutputStream("D:\\Workspace\\demo\\File1.txt");
			
			//2. Perform Write
			char x = 'T';
			fout.write(x);
			
			//3. Close Stream
			fout.close();
			
			System.out.println("Successfully Written to file..");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
