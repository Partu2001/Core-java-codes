package thread;

public class MainThread extends Thread {
	
	@Override
	public void run() {
//		for(int i=0;i<=10;i++) {
//			System.out.println("Child Thread :" +Thread.currentThread().getPriority() + "Name :" +Thread.currentThread().getName()+ " " + i);
//			try {
//				Thread.sleep(1000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		try {
			  Thread.sleep(1000);
		      System.out.println("IN thread");
		}catch(InterruptedException e) {
			System.out.println("Interrupted....");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		MainThread t1=new MainThread();
//		t1.start();
//		System.out.println(t1.isInterrupted());
//		t1.interrupt();
//		System.out.println(t1.isInterrupted());
		
		System.out.println(t1.isAlive());
		t1.start();
		System.out.println(t1.isAlive());
				
			
	}

}
