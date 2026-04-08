package object;
import java.util.Scanner;
public class Employee{
    int empid;
	String empname;
	double empsalary;
	long empcontact;
	
	Scanner sc=new Scanner(System.in);
	
	public void Employee() {
		
	}
	public void Employee(int empid,String empname,double empsalary,long contact) {
		this.empid=empid;
		this.empname=empname;
		this.empsalary=empsalary;
		this.empcontact=empcontact;
	}
	public  String tostring() {
		return 
				empid +" "+ empname+" " +empsalary + " " +empcontact; 
		
	}
	public void Accept() {
		System.out.println("Enter the Employee Details:");
		System.out.println("Enter Id:");
		empid=sc.nextInt();
		System.out.println("Enter Name:");
		empname=sc.next();
		System.out.println("Enter Salary:" );
		empsalary=sc.nextDouble();
		System.out.println("Enter Contact");
		empcontact=sc.nextLong();
		
	}
	public void show() {
		System.out.println("Employee Deatils:");
		System.out.println("Id:" +empid);
		System.out.println("Name:" +empname);
		System.out.println("Salary:" +empsalary);
		System.out.println("Contact:" +empcontact);
		
	}
	
	
}
