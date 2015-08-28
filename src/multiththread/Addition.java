package multiththread;

//Note: To create a Thread Just extend the Thread Class
public class Addition extends Thread {

	int a;
	int b;
	String threadName;
	
	Addition(int a, int b, String threadName) {
		this.a = a;
		this.b = b;
		this.threadName = threadName;
	}
	
	//Override this run() method
	//Java will invoke this method when the thread starts
	//Any code written inside  this run() method will be executed parallel
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(threadName +  ": Run method invoked..");
		add();
	}
	
	public void add() {
		int sum = a + b;
		System.out.println("Sum = " + sum);
	}
	
}
