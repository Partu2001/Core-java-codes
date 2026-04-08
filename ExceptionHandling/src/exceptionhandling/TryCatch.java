package exceptionhandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,b;
		
		System.out.println("Enter a:");
		a=sc.nextInt();
		
		System.out.println("Enter b:");
		b=sc.nextInt();
		
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			//System.out.println(e.printStackTrace());
		}
		finally {
			System.out.println("In finally block");
			sc.close();
		}
		System.out.println("Task Cpmpleted.....");
		
		try {
			FileReader fr=new FileReader("");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
