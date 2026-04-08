package a;
import java.util.Scanner;
import java.util.Scanner;
public class Student {
	String name;
	int age;
	int m1,m2,m3,m4,m5;
	int totalmarks;
	int percent;
	char grade;
	Scanner sc=new Scanner(System.in);


	public void Accept() {
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Enter the age:");
		age=sc.nextInt();
		System.out.println("Enter the m1:");
		m1=sc.nextInt();
		System.out.println("Enter the m2:");
		m2=sc.nextInt();
		System.out.println("Enter the m3:");
		m3=sc.nextInt();
		System.out.println("Enter the m4:");
		m4=sc.nextInt();
		System.out.println("Enter the m5:");
		m5=sc.nextInt();
		
	}
	
	public void TotalMarks() {
	
	 totalmarks=m1+m2+m3+m4+m5;
		System.out.println("Total marks:" + totalmarks);
	}
	public void Percentage() {
	    percent=(totalmarks)/5;
		System.out.println("Percentage:" +percent);
	}
	public void Grade() {
		if(percent>90) {
			System.out.println("Grade A");
		}
		else if(percent>70 || percent<=90 ) {
			System.out.println("Grade B");
		}
		else if(percent>50 || percent<=70 ) {
			System.out.println("Grade C");
		}
		else if(percent>35 || percent<=50) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Grade Fail");
		}
	}
}
