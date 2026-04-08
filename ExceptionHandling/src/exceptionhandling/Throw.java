package exceptionhandling;

import java.util.Scanner;

public class Throw {
	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		int a,b;
		
		System.out.println("Enter a:");
		a=sc.nextInt();
		
		System.out.println("Enter b:");
		b=sc.nextInt();
		
		if(b==0) {
			throw new Exception ("O is not divisble");
		}
		else {
			System.out.println(a/b);
		}
	}

}
