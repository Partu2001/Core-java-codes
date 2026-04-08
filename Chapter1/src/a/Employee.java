package a;
import java.util.Scanner;

public class Employee {
	int id;
	String name;
	int salary;
	Scanner sc=new Scanner(System.in);
	
	public Employee(){
		System.out.println("This is the info about Employee");
		AcceptInfo();
		ShowData();
	}
	
	public void AcceptInfo() {
		System.out.println("Enter the ID:");
		id=sc.nextInt();
		System.out.println("Enter the Employee Name:");
		name=sc.next();
		System.out.println("Enter the salary of Employee:");
		salary=sc.nextInt();
		}
	public void ShowData() {
		System.out.println("The Employee Id is:" +id);
		System.out.println("The Employee Name is:" +name);
		System.out.println("The Employee Salary is:" +salary);
		
	}

}
