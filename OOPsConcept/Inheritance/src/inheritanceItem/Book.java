package inheritanceItem;
import java.util.Scanner;
public class Book extends Item{
	String auther;
	int edition,volume;
	
	Scanner sc=new Scanner(System.in);

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	@Override
	public String toString() {
		return "Book [auther=" + auther + ", edition=" + edition + ", volume=" + volume + ", sc=" + sc + "]";
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String auther, int edition, int volume, Scanner sc) {
		super();
		this.auther = auther;
		this.edition = edition;
		this.volume = volume;
		this.sc = sc;
	}

	public void accept() {
	    super.accept();
		System.out.println("Enter Book Details:");
		System.out.println("Enter Auther:");
		setAuther(sc.next());
		System.out.println("Enter Edition :");
		setEdition(sc.nextInt());
		System.out.println("Enter Volume :");
		setVolume(sc.nextInt());
	}
	
	public void display() {
		super.display();
		System.out.println("Book Details:");
		System.out.println("Auther:" +getAuther());
		System.out.println("Edition :" +getEdition());
		System.out.println(" Volume :" +getVolume());
		
	}
	
	
	
	
	
	

}
