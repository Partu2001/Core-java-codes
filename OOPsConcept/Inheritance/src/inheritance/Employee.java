package inheritance;
import java.util.Scanner;
public class Employee extends Person {
	String department,qualification;
	int salary;
	Scanner sc=new Scanner(System.in);
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [department=" + department + ", qualification=" + qualification + ", salary=" + salary
				+ "]";
	}
	public Employee(String department, String qualification, int salary) {
		super();
		this.department = department;
		this.qualification = qualification;
		this.salary = salary;
	}
	public Employee() {
		
	}
	
	public void acceptEmployee() {
		System.out.println("Enter Employee Details:");
		System.out.println("Enter Department:");
		setDepartment(sc.next());
		System.out.println("Enter Qulification:");
		setQualification(sc.next());
		System.out.println("Enter Salary:");
		setSalary(sc.nextInt());
		
	}
	
	public void displayEmployee() {
		System.out.println("Employee Details:");
		System.out.println("Department:"+getDepartment());
		System.out.println("Qulification:"+getQualification());
		System.out.println("Salary:"+getSalary());
		
	}
	
	
	
	

}
