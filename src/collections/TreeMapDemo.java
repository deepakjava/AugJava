package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	/*
	 * Difference between HashMap and TreeMap
	 * HashMap - Adds the values in any Order 
	 * TreeMap - Adds values in Sorted Order (Sorting happens based on Key)
	 */
	public static void main(String args[]) {
		// Create a hash map
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		// Put elements to the map
		tm.put("Thierry", 700);
		tm.put("Madhavi", 500);
		tm.put("Felix", 100);
		tm.put("Ruifeng", 900);
		tm.put("Raj", 200);

		// Get an iterator
		Set keySet = tm.keySet();
		Iterator<String> i = keySet.iterator();
		// Display elements
		while (i.hasNext()) {
			String key = i.next();
			System.out.print("Key : " + key);
			System.out.println(" Value = " + tm.get(key));
		}
		System.out.println();
	}
}

/*
********HashMap Output **********
Key : Ruifeng Value = 900
Key : Thierry Value = 700
Key : Felix Value = 100
Key : Raj Value = 200
Key : Madhavi Value = 500

*/