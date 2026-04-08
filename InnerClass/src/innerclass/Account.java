package innerclass;

public class Account {
	int accountid=101,balance=100000;
	String name="Partu";
	
	public class Locker{
		public void display() {
	 System.out.println("Id:"+accountid);
	 System.out.println("Balance:"+balance);
	 System.out.println("Name:"+name);
		
		}
	}

}
