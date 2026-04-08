package chapter2;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
		for(int num:arr) {
			System.out.println(num);
		}
		float f[]= {10.0f,20.0f,30.0f,40.0f,50.0f};
		for(float num:f) {
			System.out.println(num);
		}
		
		ArrayD d=new ArrayD();
		d.display(1,2,3);
		// TODO Auto-generated method stub
     sc.close();
	}
    
}
