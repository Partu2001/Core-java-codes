package a;
import java.util.Scanner;
public class Phone {
	String camera;
	String processor;
	int battery;
	String mname;
	String os;
	int ram;
	int storage;
	
	Scanner sc=new Scanner(System.in);
	
	public void Accept() {
		System.out.println("Enter the camera size:");
		camera=sc.next();
		System.out.println("Enter the Processor Name:");
		processor=sc.next();
		System.out.println("Enter the Battery :");
		battery=sc.nextInt();
		System.out.println("Enter the Name of Mobile:");
		mname=sc.next();
		System.out.println("Enter the OS:");
		os=sc.next();
		System.out.println("Enter the RAM:");
		ram=sc.nextInt();
		System.out.println("Enter the Storage:");
		storage=sc.nextInt();
	}
	
	public void Show() {
		System.out.println("The Camera Size:" + camera +"PX");
		System.out.println("The Processor Name:" +processor);
		System.out.println("The Battery Backup:" +battery +"mAh" );
	    System.out.println("The Mobile Name:" +mname); 
        System.out.println("The OS of mobile:" +os);
        System.out.println("The RAM of Mobile:" +ram +"GB");
        System.out.println("The Storage of Mobile:" +storage + "GB");
        
	
	}

}
