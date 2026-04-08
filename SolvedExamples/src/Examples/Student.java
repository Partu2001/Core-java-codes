package Examples;

public class Student {
	int rollno;
	String name;
	int percentage;
	
	public void InitStudent(int r,String n,int p) {
		rollno=r;
		name=n;
		percentage=p;
	}
	
	public void DetailStudent(){
		System.out.println("Enter the RollNo:"+rollno);
		System.out.println("Enter the Name:"+name);
		System.out.println("Enter the Percentage:"+percentage);
}
}
