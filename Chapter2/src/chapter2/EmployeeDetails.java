package chapter2;
import java.util.Scanner;
public class EmployeeDetails {
	int id;
	String name;
	int salary;
	String position;
	Scanner sc=new Scanner(System.in);

	EmployeeDetails(){
		
	}
	EmployeeDetails(int id,String name,int salary,String position){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.position=position;
}
	public String tostring() {
		return id + " " + name +" " +salary +" " + position;
	}
	
	public void Accept(EmployeeDetails arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=new EmployeeDetails();
			System.out.println("Enter the ID:");
			arr[i].id=sc.nextInt();
			System.out.println("Enter the name:");
			arr[i].name=sc.next();
			System.out.println("Enter the salary:");
			arr[i].salary=sc.nextInt();
			System.out.println("Enter the position:");
			arr[i].position=sc.next();
		}
	}
		public void Show(EmployeeDetails arr[]){
			for(int i=0;i<arr.length;i++) {
				System.out.println( "Employee ID:"+arr[i].id);
				System.out.println("Employee Name:"+arr[i].name);
				System.out.println("Employee Salary:"+arr[i].salary);
				System.out.println("Employee Position:"+arr[i].position);
		
	}
}
}