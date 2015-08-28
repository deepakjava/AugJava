package filieio;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {

		File f = new File("D:/Workspace/demo/MyFile1.txt");
		File f2 = new File("D:/Workspace/demo");
		File f3 = new File("D:/Workspace/demo/subdemo");
		//System.out.println("\n \t \r"); //"\" is used as escape character
		
		try {
			f.createNewFile(); //Java will create a New File
			System.out.println("Successfully created new file");
			
			boolean cw = f.canWrite();
			System.out.println("Can Write? " + cw);
			
			System.out.println("Is file exists?" + f2.exists());
			System.out.println("Is Directory? " + f.isDirectory());
			System.out.println("Is File? " + f.isFile());
			
			if (f2.isDirectory()) {
				String files[] = f2.list();
				for(int i=0; i<files.length; i++) {
					System.out.println(files[i]);
				}
			}
			
			f3.mkdir(); //This will create a directory called subdemo inside /demo folder
			
		} catch (IOException e) {
			e.printStackTrace(); //System.out.println(e);
		}
		//The compiler is forcing me to catch the IOException (This means IOException is a Checked Exception)
	}

}
