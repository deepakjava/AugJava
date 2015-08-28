package collections;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String args[]) throws Exception {
		Properties capitals = new Properties();
		Set states;
		String str;

		capitals.put("Illinois", "Springfield**");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");
		capitals.put("Java", "Class1");
		capitals.put("TTT", "KKK");

		// Show all states and capitals in hashtable.
		// states = capitals.keySet(); // get set-view of keys
		// Iterator itr = states.iterator();
		
		/*
		 * Steps to Iterate HashMap
		 * 1. Get the KEYS (Seperate teh Keys) from HashMap. Get KEYSET
		 * 2. Get the Iterator Object from KEY SET
		 * 3. Loop Through the Keys using Iterator
		 * 4. Using each Key - Get the Value
		 */	
		Set capKey = capitals.keySet();
		Iterator itr = capKey.iterator();
		while (itr.hasNext()) {
			str = (String) itr.next();
			System.out.println("The capital of " + str + " is "
					+ capitals.getProperty(str) + ".");
		}
		System.out.println();
	}
}