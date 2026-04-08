package multithreadingalgorithm;

public class Main {
	
	public static void main(String[] args) {
		
		UI u=new UI();
		DB d=new DB();
		Network n=new Network();
		
		u.start();
		d.start();
		n.start();
	}

}
