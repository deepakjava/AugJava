package collections;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesExternalizeDemo {

	public static void main(String args[]) throws Exception {
		Properties capitals = new Properties();
		String str;
		
		FileInputStream fis = new FileInputStream("C:\\demo\\Capital.properties");
		capitals.load(fis);
		
		// Show all states and capitals in hashtable.
		// states = capitals.keySet(); // get set-view of keys
		// Iterator itr = states.iterator();
		Set keySet = capitals.keySet();
		Iterator itr = keySet.iterator();
		while (itr.hasNext()) {
			str = (String) itr.next();
			System.out.println("The capital of " + str + " is "
					+ capitals.getProperty(str) + ".");
		}
		System.out.println();
	}
}