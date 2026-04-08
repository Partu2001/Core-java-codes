package device;

public class DvdPlayer implements RemoteDevice {

	public void switchon() {
		System.out.println("DVD is on.....");
	}
	
	public void switchoff() {
		System.out.println("DVD is off.....");
	}
}


