package filieio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInoutDemo {

	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		//System.in represents Standard Input Device. We are creating a new stream which represents Keyboard
		BufferedReader br = new BufferedReader(is);
		PrintStreamDemo.myout.print("Please enter your name");
		String st = br.readLine();
		PrintStreamDemo.myout.print("Hello: " + st);
	}

}
