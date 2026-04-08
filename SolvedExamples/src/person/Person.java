package person;

import java.util.Scanner;

public class Person {
	private String name,city;
	private int age;
	
	Scanner sc=new Scanner(System.in);
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeInvalidException{
		if(age<18) {
			throw new AgeInvalidException("Age must be 18 above");
		}
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", age=" + age + ", sc=" + sc + "]";
	}
	
	public void accept() throws AgeInvalidException {
		System.out.println("Enter Details");
		System.out.println("Enter name:");
		setName(sc.next());
		System.out.println("Enter City:");
		setCity(sc.next());
		System.out.println("Enter Age:");
		setAge(sc.nextInt());
	}
		
		public void show() {
			System.out.println("Person Details:");
			System.out.println("Enter name:" +getName());
			System.out.println("Enter City:" +getCity());
			System.out.println("Enter Age:" +getAge());
			
		}
		
	}
	
	
	
