package collections;

import java.util.ArrayList;

public class ReadArrayList {

	public void print(ArrayList al) {
		for(int i=0; i<al.size(); i++ ){
			String str = (String) al.get(i);
			System.out.println(str); //get() method will return the value stored in that index
		}
	}
}
