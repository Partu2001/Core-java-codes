package chapter2;
import java.util.Scanner;
public class MainEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		
		EvenOdd n=new EvenOdd();
		n.evenodd(num);
		// TODO Auto-generated method stub

	}

}
