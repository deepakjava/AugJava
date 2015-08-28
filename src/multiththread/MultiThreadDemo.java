package multiththread;

public class MultiThreadDemo {

	public static void main(String[] args) {
		
		
		/*
		 * 1. Create the Thread
		 * 2. Start the Thread
		 * 3.  Terminate the Thread
		 */
		
		//Step#1: Create Thread
		//Below i am creating 2 Threads - a1 and a2. Addition class is a Sub-class of Thread class.
		//Any class which is a sub-class of Thread class is a Thread
		//When we create an Object of a Thread class (in this case its Addition), we say that the Thread is Created
		Addition a1 = new Addition(10, 20, "Thread-1");
		Addition a2 = new Addition(30, 40, "Thread-2");

		System.out.println("Summing 10 and 20");
		//a1.add();
		///Step#2: Starting the thread
		//Invoke the start() method of Thread class
		//Note: start() method is in the Super class Thread of Addition
		a1.start(); //Start the Thread. This will invoke run() method 
		System.out.println("Summing 30 and 40");
		//a2.add();
		a2.start(); //Start the thread
		
		try {
			a1.join();
			a2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
