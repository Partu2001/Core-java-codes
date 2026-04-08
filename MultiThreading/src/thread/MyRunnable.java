package thread;

public class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		System.out.println("This is from runnabble...");
		// TODO Auto-generated method stub
		
	}


	public static void main(String[] args) {
		MyRunnable t2=new MyRunnable();
		Thread t=new Thread(t2);
		t.start();
		// TODO Auto-generated method stub

	}


}
