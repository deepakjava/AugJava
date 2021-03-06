package filieio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		//1. Open the Stream
		//2. Perform Read Operation
		//3. Close the Stream
		
		//The stream which we are using here is a InoutStream and its called FileInputStream
		
		try {
			//1. Open the stream
			FileReader fis = new FileReader("D:\\Workspace\\demo\\MyFile1.txt");
			
			//2. Perform Read Operation
			int x = 0;
			while (x != -1) { //Java will return -1 if EOF is reached
				x = fis.read(); 
				char c = (char) x; //Read method will read ONE byte at a time
				System.out.print(c);
			}
			
			//3. Close the stream
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
