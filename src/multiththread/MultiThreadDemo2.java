package multiththread;

public class MultiThreadDemo2 {

	public static void main(String[] args) {
		MyThread t1  = new MyThread("Thread-1");
		MyThread t2 = new MyThread("Thread-2");
		
		t1.start();
		t2.start();
	}
}


class MyThread extends Thread 
{
	String tname;
	MyThread(String tname) {
		this.tname = tname;
	}
	
	public void run() {
		System.out.println("Runn called by Thread: " + tname);
		for (int i=0; i<5; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("i value of " + tname + "  = " + i);
		}
		System.out.println("Exiting " + tname);
	}
}