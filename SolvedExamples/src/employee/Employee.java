package employee;

import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private double grossSalary;
	private double netSalary;
	
	
	Scanner sc=new Scanner(System.in);
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", sc=" + sc + "]";
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	

	public Employee(int id, String name, double salary, Scanner sc) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.sc = sc;
	}
	
	public void calGrossSalary() {
		grossSalary=salary;
	}
	
	public void calnetSalary() {
		double pf=0.12*salary;
		netSalary=grossSalary-pf;
	}

	public void accept() {
		System.out.println("Enter Employee Details:");
		System.out.println("Enter Id:");
		setId(sc.nextInt());
		System.out.println("Enter Name:");
		setName(sc.next());
		System.out.println("Enter Salary:");
		setSalary(sc.nextDouble());
	}
	
	public void display() {
		System.out.println("Employee Details:");
		System.out.println("Id:"+getId());
		System.out.println("Name:"+getName());
		System.out.println("Salary:"+getSalary());
		System.out.println("Gross Salary" +grossSalary);
		System.out.println("Net Salary:" +netSalary);
	}
	

}
