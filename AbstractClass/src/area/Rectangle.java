package area;

import java.util.Scanner;

public class Rectangle extends Area {
	int l,b;
	double res;
	
	Scanner sc=new Scanner(System.in);
	@Override 
	public void area() {
		System.out.println("Enter Length:");
		l=sc.nextInt();
		System.out.println("Enter Breadth:");
		b=sc.nextInt();
		
		res=l*b;
		System.out.println("Area:"+res);
		
	}
	
}
