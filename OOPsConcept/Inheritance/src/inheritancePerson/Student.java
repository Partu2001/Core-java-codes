package inheritancePerson;
import java.util.Scanner;
public class Student extends Person {
	int id;
	String course,collageName;
	
	Scanner Sc=new Scanner(System.in);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public Scanner getSc() {
		return Sc;
	}

	public void setSc(Scanner sc) {
		Sc = sc;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", course=" + course + ", collageName=" + collageName + ", Sc=" + Sc + "]";
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String course, String collageName, Scanner sc) {
		super();
		this.id = id;
		this.course = course;
		this.collageName = collageName;
		Sc = sc;
	}
	
	public void accept() {
		super.accept();
		System.out.println("Enter Student Details:");
		System.out.println("Enter Id:");
		setId(sc.nextInt());
		System.out.println("Enter Course:");
		setCourse(sc.next());
		System.out.println("Enter Colleg Name:");
		setCollageName(sc.next());
	}
	
	public void display() {
		super.display();
		System.out.println("Student Details:");
		System.out.println("Id:" +getId());
		System.out.println("Course:" +getCourse());
		System.out.println("Collage:" +getCollageName());

	}
	
	
	
	

}
