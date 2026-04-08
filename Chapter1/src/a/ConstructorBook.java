package a;
import java.util.Scanner;
public class ConstructorBook {
	String name;
	String auther;
	int price;
	Scanner sc=new Scanner(System.in);
	public ConstructorBook() {
		System.out.println("This is the info about book");
	}
	public  ConstructorBook(ConstructorBook b2) {
		b2.Accept();
		b2.Show();
		
		
	}
	public void Accept() {
		System.out.println("Enter the Book Name:");
		name=sc.next();
		System.out.println("Enter the Auther Name:");
		auther=sc.next();
		System.out.println("Enter the Price:");
		price=sc.nextInt();
		
		
		
	}
	public void Show() {
		System.out.println("The Book Name:" +name);
		System.out.println("The Auther Name:" +auther);
		System.out.println("The Book Price:" +price);
		
	}
}
