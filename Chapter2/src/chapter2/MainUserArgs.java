package chapter2;
import java.util.Scanner;
public class MainUserArgs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int [3];
		System.out.println("Enter the name:");
		String name=sc.next();
		UserArgs.accept(name, arr);// TODO Auto-generated method stub

	}

}
