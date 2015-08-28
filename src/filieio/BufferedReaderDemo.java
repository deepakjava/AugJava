package filieio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		
		//BufferedReader Reads Line By Line and gives better performance while reading HUGe file data
		
		//1. Open the Stream
		//2. Perform Read Operation
		//3. Close the Stream
		
		//The stream which we are using here is a InoutStream and its called FileInputStream
		
		try {
			//1. Open the stream
			FileReader fis = new FileReader("D:\\Workspace\\demo\\MyFile1.txt");
			BufferedReader br = new BufferedReader(fis); //Pass the FileReader object to BufferedReader
			
			//2. Perform Read Operation
			String s = "";
			while (s != null) { //Java will return NULL if EOF is reached
				s = br.readLine(); 
				System.out.println(s);
			}
			
			//3. Close the stream
			fis.close();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
