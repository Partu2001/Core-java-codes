package thread;

public class ThreadLifeCycle extends Thread {

	public void run() {
		System.out.println("RUNNABLE");
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			 System.out.println(e);
		}
		System.out.println("Thread after sleep");
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadLifeCycle t1=new ThreadLifeCycle();
		System.out.println(t1.getState());
		
		t1.start();
	    System.out.println(t1.getState());
	    
	    Thread.sleep(1000);
	    System.out.println(t1.getState());
	    
	    t1.join();
	    System.out.println(t1.getState());
	}
}
