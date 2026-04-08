package chapter2;
import java.util.Scanner;

public class Student {
	int id;
	String name;
	Scanner sc=new Scanner(System.in);

   public void Student() {
	   
 }
   public void Student(int id,String name) {
	   this.id=id;
	   this.name=name;
   }
   public String tostring() {
	   return id+ " " + name;
   }
   public void Accept(Student arr[]) {
	   for(int i=0;i<arr.length;i++) {
		   arr[i]=new Student();
		   System.out.println("Enter the name:");
		   arr[i].name=sc.next();
		   System.out.println("Enter the Id:");
		   arr[i].id=sc.nextInt();	  
		   }
   }
   public void Show(Student arr[]) {
	   for(int i=0;i<arr.length;i++) {
	   System.out.println(arr[i].name);
	   System.out.println(arr[i].id);
   }
   }
}
