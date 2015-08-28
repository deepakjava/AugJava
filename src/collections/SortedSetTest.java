package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class SortedSetTest {

	//TreeSet is used to Store values in Sorted Order
	//TreeSet is Similar to HashSet only difference is HashSet stores values Randomly
	//Where as TreeSet stores in Sorted Order
	//Use TreeSet when there is a requirement to Store the values in Sorted Order
	public static void main(String[] args) {

		// Create the sorted set
		TreeSet<String> set = new TreeSet<String>();

		// Add elements to the set
		set.add("b");
		set.add("c");
		set.add("a");
		set.add("s");
		set.add("d");
		// Iterating over the elements in the set
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			// Get element
			String value = it.next();
			System.out.println(value);
		}
	}
}