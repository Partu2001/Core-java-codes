package multithreadingalgorithm;

public class Network extends Thread {
	
	@Override
	public void run() {
		System.out.println("Transaction...");
		System.out.println("Receive...");
	}

}
