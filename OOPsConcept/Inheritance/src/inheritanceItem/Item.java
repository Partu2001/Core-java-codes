package inheritanceItem;
import java.util.Scanner;
public class Item {
	String title,publisher;
	int yearpublished,isbn;
	double price;
	
	Scanner sc=new Scanner(System.in);

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearpublished() {
		return yearpublished;
	}

	public void setYearpublished(int yearpublished) {
		this.yearpublished = yearpublished;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	@Override
	public String toString() {
		return "Item [title=" + title + ", publisher=" + publisher + ", yearpublished=" + yearpublished + ", isbn="
				+ isbn + ", price=" + price + ", sc=" + sc + "]";
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String title, String publisher, int yearpublished, int isbn, double price, Scanner sc) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.yearpublished = yearpublished;
		this.isbn = isbn;
		this.price = price;
		this.sc = sc;
	}
	
	
	public void accept() {
		System.out.println("Enter Item Details:");
		System.out.println("Enter title:");
		setTitle(sc.next());
		System.out.println("Enter Publisher:");
		setPublisher(sc.next());
		System.out.println("Enter Year of Published:");
		setYearpublished(sc.nextInt());
		System.out.println("Enter ISBN:");
		setIsbn(sc.nextInt());
		System.out.println("Enter Price:");
		setPrice(sc.nextDouble());
	}
	
	public void display() {
		System.out.println("Item Details:");
		System.out.println(" Title:" +getTitle());
		System.out.println("Publisher:" +getPublisher());
		System.out.println(" Year of Published:" + getYearpublished());
		System.out.println(" ISBN:" +getIsbn());
		System.out.println(" Price:" +getPrice());
		
	}

}
