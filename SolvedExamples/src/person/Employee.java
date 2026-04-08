package person;

import java.util.Scanner;

public class Employee extends Person {
	private int id;
	private String department;
	private double salary;
	
	Scanner sc=new Scanner(System.in);
	
	
	public Employee(String name, String city, int age) {
		super(name, city, age);
		// TODO Auto-generated constructor stub
	}
	
	


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Employee(int id, String department, double salary) {
		super();
		this.id = id;
		this.department = department;
		this.salary = salary;
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


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", department=" + department + ", salary=" + salary + ", sc=" + sc + ", getId()="
				+ getId() + ", getDepartment()=" + getDepartment() + ", getSalary()=" + getSalary() + ", getName()="
				+ getName() + ", getCity()=" + getCity() + ", getAge()=" + getAge() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


	public void accept() throws AgeInvalidException {
		super.accept();
		System.out.println("Enter Employee Details:");
		System.out.println("Enter Id:");
		setId(sc.nextInt());
		System.out.println("Enter Department:");
		setDepartment(sc.next());
		System.out.println("Enter Salary:");
		setSalary(sc.nextDouble());
	}
	
	public void show() {
		super.show();
		System.out.println("Employee Details:");
		System.out.println("Enter Id:" +getId());
		System.out.println("Enter Department:" +getDepartment()); 
		System.out.println("Enter Salary:" +getSalary());
	
	}
	
	
	
	

}
