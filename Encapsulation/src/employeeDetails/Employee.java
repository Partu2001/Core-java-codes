package employeeDetails;
public class Employee {
	int id;
	String name;
	double salary;
	Address adr;

	public Employee() {
		
	}
	
	public Employee(int id,String name,double salary,Address adr) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.adr=adr;
	}
	
	public String toString() {
		return id+ " " +name +" " +salary + " " +adr;
	}
}
