package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetDemo {
	
	//HashSet is Similar to ArrayList
	//This will store the Objects using Hash Code instead of Index (Uses concept of HashMap)
	//HashSet will not Store duplicate Values (Whareas ArrayList can Store duplicate Values)
	//Looping through the Objects in HashSet is Faster compared to ArrayList
	//Also, We use HashSet when ever we need to avoid Duplicate Values
	public static void main(String[] args) {
		//ArrayList<String> hashSet = new ArrayList<String>();
		
		TreeSet<String> hashSet = new TreeSet<String>(); //It will SORT the keys in ASC order
		
		//HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("Java1");
		hashSet.add("Java2");
		hashSet.add("Java3");
		hashSet.add("Java4");
		hashSet.add("Java5");
		hashSet.add("Java1"); //This is a Duplicate and HasSet will NOT ACCEPT  This
		
		Iterator itr = hashSet.iterator();
		
		while (itr.hasNext()) {
			String s =  (String) itr.next();
			System.out.println(s);
		}
	}

}
