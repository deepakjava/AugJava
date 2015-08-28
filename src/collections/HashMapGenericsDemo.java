package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapGenericsDemo {

	public static void main(String[] args) {
		//Create an HashMap object which can hold String as Key and String as Value
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("JavaBook-1", "Core Java");
		hm.put("JavaBook-2", "Java Servlets");
		hm.put("DOTNETBook-1", "Dot Net Basics");
		hm.put("DOTNETBook-2", "Dot Net Advanced");
		//hm.put("Num", 1000); //As i am trying to add Integer to HashMap this will give me Compilation Error
		
		//Ex-1: Create a HashMap object which accepts String as Key and Integer as Value
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		hm1.put("Num", 10000);
		
		//Ex-2: Create a HashMap object which accepts String as Key and ArrayList as Value
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java1");
		al.add("Java2");
		//hm.put("XYZ", al); //Storing 2 values in HashMap against the Key = XYZ		
		HashMap<String, ArrayList> hm2 = new HashMap<String, ArrayList>();
		hm2.put("XYZ", al);
		
		//System.out.println("HashMap Size = " + hm.size());
		String value = (String) hm.get("JavaBook-1");
		//System.out.println(value);
		
		
		ArrayList arrList = (ArrayList) hm2.get("XYZ");
		for(int i=0; i< arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		/*
		 * Steps to Iterate HashMap
		 * 1. Get the KEYS (Seperate teh Keys) from HashMap. Get KEYSET
		 * 2. Get the Iterator Object from KEY SET
		 * 3. Loop Through the Keys using Iterator
		 * 4. Using each Key - Get the Value
		 */
		
		//#1
		Set keySet = hm.keySet(); //This will Give me the Set of Keys
		//#2
		Iterator itr = keySet.iterator();
		//#3
		while(itr.hasNext()) { //hasNext() will check if there is another Key
			String key = (String) itr.next(); //Gives the KEY
			System.out.println("KEY = " + key);
			//#4
			Object ob = hm.get(key);
			if (ob instanceof String) {
				String val = (String) ob;
				System.out.println("VAL: " + val);
			} else if ( ob instanceof Integer) {
				Integer val = (Integer) ob;
				System.out.println("VAL: " + val);
				
			}
		}
	}
}
