package multiththread;

/*
class SavingsAccount {
	//R1 = 5000 // Get 5000
	//R2 = 5000 // Get 0
	
	//R2 to wait
	public synchronized void withdraw() {
		//R1 inside
		int amt = 5000;
		//Subtraction....
		//R1 exits
	}
	
}
*/

//File Name : Callme.java
//This program uses a synchronized block.
//[Hello][Synchronized][World]

//[Hello[Synchronized[World]]]

//[Hello][Synchronized][World] - Applying LOCK


//[Hello]

/*
 * Synchronized
 * 1. Can be applied to Methods Singnature
 * 2. Can be applied to some code within the method. We use Synchronized block
 * 3. Can be applied from Outside - Synchronized Object
 */

//***Note****
// Inter-thread Communication
//This is a Concept where One Thread communicates with Another Thread

class Print {
	//t1, t2, t3
	//[Hello[Synchronized[World]]]
	//[Hello][Synchronized][World]
	//[Hello][Synchronized][World]
	synchronized void call(String msg) { //Lock
			System.out.print("[" + msg);
			try {
				Thread.sleep(10000);//Hello, Syncronized, World
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
			System.out.print("]");
	}
}

// File Name : Caller.java
//This is a Thread class.
class CallerThread extends Thread  {
	String msg;
	Print ob;

	public CallerThread(Print ob, String msg) {
		this.ob = ob;
		this.msg = msg;
	}

	// synchronize calls to call()
	public void run() {
			ob.call(msg); //As this call method is invoked inside the Thread, this will be called asynchronously
	}
}

//[Hello][Synchronized][World]
public class SyncObjectDemo {
	public static void main(String args[]) { //Main is also a Thread
			Print ob = new Print();
		
			CallerThread t1 = new CallerThread(ob, "Hello"); //Thread-1
			CallerThread t2 = new CallerThread(ob, "Synchronized"); //Thread-2
			CallerThread t3 = new CallerThread(ob, "World");//Thread-3
			
			t1.start();
			t2.start();
			t3.start();
		// wait for threads to end
		try {
			t1.join(); //Main thread waits for ob1 thread to complete.
			t2.join(); //join() methid will make the Main Thread to wait till its Child Thread cmpletes its task
			t3.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}