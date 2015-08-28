package filieio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("d:/workspace/demo/emp.obj");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee emp = (Employee) ois.readObject();
			//Note: WE ARE NOT CREATING A NEW EMPLOYEE OBJECT. What we are are doing - we are just reading the Object stored in a file
			emp.printEmployee();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
