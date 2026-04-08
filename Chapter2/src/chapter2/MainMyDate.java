package chapter2;

public class MainMyDate {

	public static void main(String[] args) {
		MyDate d[]=new MyDate[2];
		d[0]=new MyDate(9,1,1);
		d[1]=new MyDate(1,9,2);
		
		System.out.println("Before Swapping:");
		System.out.println(d[0]);
		System.out.println(d[1]);
		
		MyDate.swap(d);
		System.out.println("After Swapping:");
		System.out.println(d[0]);
		System.out.println(d[1]);

	}

}

