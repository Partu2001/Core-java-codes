package inheritancePerson;
import java.util.Scanner;
public class Person {
	String name,city;
	int age;
	long phone;

	Scanner sc=new Scanner(System.in);

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

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", age=" + age + ", phone=" + phone + ", sc=" + sc + "]";
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String city, int age, long phone, Scanner sc) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
		this.phone = phone;
		this.sc = sc;
	}
	
	public void accept() {
		System.out.println("Enter Person Details:");
		System.out.println("Enter Name:");
		setName(sc.next());
		System.out.println("Enter City:");
		setCity(sc.next());
		System.out.println("Enter Age:");
		setAge(sc.nextInt());
		System.out.println("Enter Phone no");
		setPhone(sc.nextLong());
	}
	
	public void display() {
		System.out.println("Person Details:");
		System.out.println("Name:" +getName());
		System.out.println("City:" +getCity());
		System.out.println("Age:" +getAge());
		System.out.println("Phone no:" +getPhone());
	}
	
	
	
}
