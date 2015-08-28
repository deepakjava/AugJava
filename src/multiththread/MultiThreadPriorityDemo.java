package multiththread;

public class MultiThreadPriorityDemo {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * 1. Create Thread 
		 * 2. Start Thread
		 * 3. Wait for Threads to Complete
		 * 
		 * Priority - 1 Is low and 10 is High
		 * We can assign any number between 1 and 10
		 */
		Addition a1 = new Addition(10, 20, "Addition-1"); //Create Thread
		Addition a2 = new Addition(30, 40, "Addition-2"); //Create Thread
		Addition a3 = new Addition(50, 60, "Addition-3"); //Create Thread
		
		System.out.println("Invoking Addition-1");
		a1.setPriority(1); //MIN_PRIORITY
		a1.start(); //This will Start the Thread by invoking run() method

		System.out.println("Invoking Addition-2");
		a2.setPriority(4);
		a2.start(); //This will Start the Thread by invoking run() method
		
		System.out.println("Invoking Addition-3");
		a3.setPriority(10);
		a3.start(); //This will Start the Thread by invoking run() method
		
		a1.join(); //This will make Main/Demon Thread to wait till a1 thread completes
		a2.join(); 
		a3.join(); 
		
		System.out.println("Exiting Main Thread/Method");
	}
}

/** SINGLE THREAD OUTPUT 
Invoking Addition-1
Sum = 30
Invoking Addition-2
Sum = 70
Invoking Addition-3
Sum = 110
**/

/** MULTI THREAD OUTPUT
Invoking Addition-1
Invoking Addition-2
Invoking Addition-3
Sum = 30
Sum = 70
Sum = 110
**/