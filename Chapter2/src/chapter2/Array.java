package chapter2;
import java.util.Scanner;
public class Array {
	Scanner sc=new Scanner(System.in);
	public void Accept(int arr[]) {
		System.out.println("Enter array elements:");
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
	}
	
	public void Display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("Array is Even:" +arr[i]);
			}
			else {
				System.out.println("Array is Odd:" +arr[i]);
			}
		}
	}
}
