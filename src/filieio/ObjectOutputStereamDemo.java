package filieio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStereamDemo {

	public static void main(String[] args) {
			Employee emp1 = new Employee(1, "Emp-1", "CS");
			emp1.printEmployee();
			
			//Now, lets try to save/persist this employee Object into our File System
			
			try {
				FileOutputStream fos = new FileOutputStream("d:/workspace/demo/emp.obj");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(emp1);
				System.out.println("Object written successfully..");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			}
			
	}

}
