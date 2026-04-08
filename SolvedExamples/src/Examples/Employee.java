package Examples;

public class Employee {
	static int empid=100;
	String name;
	int salary;

 public Employee(String n,int s){
	 empid++;
	 name=n;
	 salary=s;
 }
 public void Show(){
	 System.out.println(empid);
	 System.out.println(name);
	 System.out.println(salary);
 }
}
