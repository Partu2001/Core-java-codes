package chapter2;
import java.util.Scanner;
public class UserArgs {
	public static void accept(String name,int...marks) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Student Marks:");
		System.out.println(marks.length);
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
			System.out.println(marks[i]);
		}
		for(int m:marks) {
			System.out.println(m);
		}
		
	}

}
