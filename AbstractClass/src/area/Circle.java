package area;

import java.util.Scanner;

public class Circle extends Area {
	int r;
	double res;
	Scanner sc=new Scanner(System.in);
	@Override
	public void area() {
		System.out.println("Enter radius:");
		r=sc.nextInt();
		
		 res=r*r*3.14;
		 System.out.println("Area:"+res);
	}
	
}
