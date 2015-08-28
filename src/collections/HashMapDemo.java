package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("JavaBook-1", "Core Java");
		hm.put("JavaBook-2", "Java Servlets");
		hm.put("DOTNETBook-1", "Dot Net Basics");
		hm.put("DOTNETBook-2", "Dot Net Advanced");
		hm.put("Num", 1000);
		//System.out.println("HashMap Size = " + hm.size());
		String value = (String) hm.get("DOTNETBook-1"); //PASS the KEY to get the VALUE
		System.out.println("Value from Key JavaBook-1 is " + value);

		ArrayList webServicesList = new ArrayList();
		webServicesList.add("Java1");
		webServicesList.add("Java2");
		hm.put("WS", webServicesList); //Storing 2 values in HashMap against the Key = XYZ

		ArrayList dotNetList = new ArrayList();
		dotNetList.add(".NET1");
		dotNetList.add(".NET2");
		hm.put("DOTNET", dotNetList);
		
		
		ArrayList arrList = (ArrayList) hm.get("WS");
		for(int i=0; i< arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("==========================================================================");
		//==========================================================================================
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
			Object valueOb = hm.get(key);
			if (valueOb instanceof String) {
				String val = (String) valueOb;
				System.out.println("VAL: " + val);
			} else if ( valueOb instanceof Integer) {
				Integer val = (Integer) valueOb;
				System.out.println("VAL: " + val);
				
			}
			System.out.println("----------");
		}
	}
}
