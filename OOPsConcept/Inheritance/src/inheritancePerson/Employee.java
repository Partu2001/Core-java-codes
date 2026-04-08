package inheritancePerson;
import java.util.Scanner;
public class Employee extends Person {
	String post,qualification;
	double salary;
	
	Scanner sc=new Scanner(System.in);

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
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
		return "Employee [post=" + post + ", qualification=" + qualification + ", salary=" + salary + ", sc=" + sc
				+ "]";
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String post, String qualification, double salary, Scanner sc) {
		super();
		this.post = post;
		this.qualification = qualification;
		this.salary = salary;
		this.sc = sc;
	}
	
	public void accept() {
		super.accept();
		System.out.println("Enter Employee Details:");
		System.out.println("Enter Post:");
		setPost(sc.next());
		System.out.println("Enter Qualification:");
		setQualification(sc.next());
		System.out.println("Enter Salary:");
		setSalary(sc.nextDouble());
	}
	
	public void display() {
		super.display();
		System.out.println("Employee Details:");
		System.out.println("Post:" +getPost());
		System.out.println("Qualification:" +getQualification());
		System.out.println("Salary:" +getSalary());

	}
	
	

}
