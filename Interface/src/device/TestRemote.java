package device;

public class TestRemote {

	public static void main(String[] args) {
		
		RemoteDevice r1=new TV();
		r1.switchon();
		r1.switchoff();
		
		RemoteDevice r2=new DvdPlayer();
		r2.switchon();
		r2.switchoff();
		// TODO Auto-generated method stub

	}

}
