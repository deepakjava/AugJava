package collections;

//POJO - Plain Old Java Objects
//OR
//Java Bean Class  -(This is similar to Java Bean Class)
//Java Bean Class is a class which can Store values and Retrieve Values without any Business Logic or Functionality
public class Book {
	int bookId;
	String bookName;
	
	//1. Store the Values
	Book(int bookId, String bookName) {
		this.bookId = bookId;
		this.bookName = bookName;		
	}
	
	//2. Print Values which is Stored
	public void printBook() {
		System.out.println("Book ID: " + bookId + ", Book Name: " + bookName);
	}
	
	//This is defined in Object class which we are Overriding here
	public String toString() {
		return "Book ID: " + bookId + ", Book Name: " + bookName;
	}
}
