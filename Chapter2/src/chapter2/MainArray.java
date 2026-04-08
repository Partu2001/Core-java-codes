package chapter2;
import java.util.Scanner;
public class MainArray {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of array:");
	int n=sc.nextInt();
	Array a=new Array();
	int arr[]=new int[n];
	a.Accept(arr);
	a.Display(arr);
	}
}
