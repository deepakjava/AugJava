package multiththread;

//This is Optional - Java will Import all java.lang pacakage
import java.lang.Thread;

public class SingleThreadDemo {

	public static void main(String[] args) {
		
		try {
			for (int i=1; i<=5; i++) {
				//Java gives a class called Thread class.
				//Thread class is defined in java.lang package
				Thread.sleep(5000); //Make the main() thread sleep for 5 secs
				System.out.println("i = " + i);
			}
		}catch(InterruptedException ie) {
			System.out.println("Exception..");
		}
		System.out.println("Completed..");
	}

}
