package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		String books[]  =new String[3];
		books[0] = "Java";
		books[1] = "JSP";
		books[2] = "servlets";
		//books[3] = "Oracle"; //This is not possible as size is 3 
		System.out.println("Books from Arrays....");	
		for(int i=0; i<books.length; i++ ){
			System.out.println(books[i]);
		}
		
		ArrayList<String> booksList = new ArrayList<String>();
		
		//I am using Generics to tall Java that accept only String values into this ArrayList
		booksList.add("Java");		//0
		booksList.add("JSP");		//1
		booksList.add("Servlets");	//2
		booksList.add("Oracle");	//3
		booksList.add(".NET");		//4
		booksList.add(".NET");		//5
		
		Integer ob = new Integer(100);
		//booksList.add(ob); //we can pass an Integer value also
		//Since i am using Generics, adding Integer is not allowed. Will give compilation error
		
		booksList.add(1, "Springs"); //This will insert this value in index 1
		booksList.remove(3); //removes the Object/value in 3rd Index
		
		System.out.println("Books from ArrayList....");
		ReadArrayList ra = new ReadArrayList();
		ra.print(booksList);
		
		/*
		for(int i=0; i<booksList.size(); i++ ){
			System.out.println(booksList.get(i)); //get() method will return the value stored in that index
		}
		*/
	}

}
