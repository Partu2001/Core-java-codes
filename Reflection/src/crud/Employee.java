package crud;

import java.util.Scanner;

public class Employee extends Person {
	
	private int id;
	private String department,post;
	private double salary;
	
	Scanner sc=new Scanner(System.in);

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String department, String post, double salary, Scanner sc) {
		super();
		this.id = id;
		this.department = department;
		this.post = post;
		this.salary = salary;
		this.sc = sc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", department=" + department + ", post=" + post + ", salary=" + salary + ", sc="
				+ sc + ", getId()=" + getId() + ", getDepartment()=" + getDepartment() + ", getPost()=" + getPost()
				+ ", getSalary()=" + getSalary() + ", getSc()=" + getSc() + ", getAge()=" + getAge() + ", getName()="
				+ getName() + ", getCity()=" + getCity() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public void accept() {
		super.accept();
		System.out.println("Enter Employee Details:");
		System.out.println("Enter Id:");
		setId(sc.nextInt());
		System.out.println("Enter Department:");
		setDepartment(sc.next());
		System.out.println("Enter Post:");
		setPost(sc.next());
		System.out.println("Enter Salary:");
		setSalary(sc.nextDouble());
		
	}
	
	public void show() {
		super.show();
		System.out.println("Employee Details:");
		System.out.println("Id:"+getId());
		System.out.println("Department:" +getDepartment());
		System.out.println("Post:" +getPost());
		System.out.println("Salary:"+getSalary());
	}

}
