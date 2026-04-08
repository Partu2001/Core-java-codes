package inheritance;
import java.util.Scanner;
public class Person {
	int id;
	String name,address;
	int age;
	Scanner sc=new Scanner(System.in);
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Person(int id, String name, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public Person() {

	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age +  "]";
	}
	
	public void acceptPerson() {
		System.out.println("Enter Person Details:");
		System.out.println("Enter Id:");
		setId(sc.nextInt());
		System.out.println("Enter Name:");
		setName(sc.next());
		System.out.println("Enter Address:");
		setAddress(sc.next());
		System.out.println("Enter Age:");
		setAge(sc.nextInt());
	}
	
	public void displayPerson() {
		System.out.println("Person Details:");
		System.out.println("Id:"+getId());
		System.out.println("Name:" +getName());
		System.out.println("Address:"+getAddress());
		System.out.println("Age:"+getAge());
	}
	
}


	
	


