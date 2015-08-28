package filieio;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
	
	static PrintStream myout = new PrintStream(System.out); ;
	public static void main(String[] args) throws FileNotFoundException {

		PrintStream ps = new PrintStream("d:/workspace/demo/PS.txt");
		//The advantage of Sprint stream is  - it recognizes the data types. Other streams will treat all values are String values
		ps.print(100.5 + 200);  
		
		//myout = new PrintStream(System.out); //System is a class. out is an Object of PrintStream class and is static object
		//System.out = referes to Standard Output device
		myout.print("This is printed using my own PrintStream and not the default System.out.print");
	}

}
