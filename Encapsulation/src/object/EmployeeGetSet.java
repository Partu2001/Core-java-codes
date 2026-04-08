package object;
import java.util.Scanner;
public class EmployeeGetSet {
	int id,age;
	String name;
	Scanner sc=new Scanner(System.in);
	
	public void Setid(int id) {
		if(id>100) {
		this.id=id;
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	public  int  Getid() {
		return id;
	}
	public void  Setage(int age) {
		this.age=age;
	}
	public int Getage() {
		return age;
	}
	public void  Setname(String name) {
		this.name=name;
	}
	public String Getname() {
		return name;
	}
	public void accept() {
		System.out.println("Enter ID:");
		Setid(sc.nextInt());
		System.out.println("Enter Age:");
		Setage(sc.nextInt());
		System.out.println("Enter Name:");
		Setname(sc.next());
	}
	
	public void display() {
		System.out.println(Getid());
		System.out.println(Getage());
		System.out.println(Getname());
	}

}
