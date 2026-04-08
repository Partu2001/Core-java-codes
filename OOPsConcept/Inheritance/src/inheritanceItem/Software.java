package inheritanceItem;
import java.util.Scanner;
public class Software extends Item {
	float version;
	
	Scanner sc=new Scanner(System.in);

	public float getVersion() {
		return version;
	}

	public void setVersion(float version) {
		this.version = version;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	@Override
	public String toString() {
		return "Software [version=" + version + ", sc=" + sc + "]";
	}

	public Software() {
		// TODO Auto-generated constructor stub
	}

	public Software(float version, Scanner sc) {
		super();
		this.version = version;
		this.sc = sc;
	}
	
	public void accept() {
		 super.accept();
		System.out.println("Enter Software Details:");
		System.out.println("Enter Version :");
		setVersion(sc.nextFloat());
	}
	
	public void display() {
		super.display();
		System.out.println("Version: " +getVersion());
	}


	
	

}
