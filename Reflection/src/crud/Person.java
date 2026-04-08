package crud;

import java.util.Scanner;

public class Person {
	
	private int age;
	private String name,city;
	
	Scanner sc=new Scanner(System.in);

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int age, String name, String city, Scanner sc) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
		this.sc = sc;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", city=" + city + ", sc=" + sc + "]";
	}
	
	
	public void accept() {
		System.out.println("Enter the Person Details:");
		System.out.println("Enter Name:");
		setName(sc.next());
		System.out.println("Enter Age:");
		setAge(sc.nextInt());
		System.out.println("Enter City:");
		setCity(sc.next());
		
	}
	
	public void show() {
		System.out.println("Person Details:");
		System.out.println("Name:"+getName());
		System.out.println("Age:" +getAge());
		System.out.println("City:"+getCity());
	}

}
