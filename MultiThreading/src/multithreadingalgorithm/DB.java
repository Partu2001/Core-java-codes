package multithreadingalgorithm;

public class DB extends Thread {
	
	@Override
	public void run() {
		System.out.println("DB...");
		System.out.println("Retrivee...");
	}

}
