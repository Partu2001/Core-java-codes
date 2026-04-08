package a;
import java.util.Scanner;
public class EmployeeMethod {
	int id;
	String name;
	int age;
	Scanner sc=new Scanner(System.in);
	
	public void Accept() {
		System.out.println("Enter the ID:");
		id=sc.nextInt();
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Enter the age:");
		age=sc.nextInt();
	}
	public void Show() {
		System.out.println("The ID of the Employee:" +id);
		System.out.println("The Name of the Employee:" +name);
		System.out.println("The Age of the Employee:" +age);
		
	}

}
