import java.util.Scanner;
public class StudentOperations {
	int total;
	int per;
	Student s=new Student();
	Scanner sc=new Scanner(System.in);

	public void accept() {
		System.out.println("Enter Student Deatils:");
		System.out.println("Enter Student Id:");
		s.setId(sc.nextInt());
		System.out.println("Enter Student Name:");
		s.setName(sc.next());
		System.out.println("Enter Student Course:");
		s.setCourse(sc.next());
		System.out.println("Enter Marks M1:");
		s.setM1(sc.nextInt());
		System.out.println("Enter Marks M2:");
		s.setM2(sc.nextInt());
		System.out.println("Enter Marks M3:");
		s.setM3(sc.nextInt());
		System.out.println("Enter Marks M4:");
		s.setM4(sc.nextInt());
		System.out.println("Enter Marks M5:");
		s.setM5(sc.nextInt());
	}
	
	public void calTotal() {
	total=(s.getM1() + s.getM2()+s.getM3()+s.getM4()+ s.getM5());
	total=s.getTotal();
	}
	
	public void percentage() {
	  per=((s.getM1() + s.getM2()+s.getM3()+s.getM4()+ s.getM5())/500)*100;
	 per=s.getPercentage();
	}
	
	public void display() {
		System.out.println("The Student Details: ");
		System.out.println("Id:" +s.getId());
		System.out.println("Name:" +s.getName());
		System.out.println("Course:" +s.getCourse());
		System.out.println("M1:"+s.getM1());
		System.out.println("M2:"+s.getM2());
		System.out.println("M3:"+s.getM3());
		System.out.println("M4:"+s.getM4());
		System.out.println("M5:"+s.getM5());
		System.out.println("Total Marks:"+s.getTotal());
		System.out.println("Percentage:" +s.getPercentage());
		System.out.println("Grade:"+s.getGrade());
		
		
	}
}
