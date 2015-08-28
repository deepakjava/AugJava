package filieio;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		try {
			//1. Open the Stream
			FileWriter fout = new FileWriter("D:\\Workspace\\demo\\File1.txt", true); //If we pass 'true' the file contents will be appended
			BufferedWriter bw = new BufferedWriter(fout);
			
			//2. Perform Write
			bw.write("Testing APPEND...");
			
			//3. Close Stream
			bw.close();
			fout.close();
			System.out.println("Successfully Written to file..");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
