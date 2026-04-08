package a;

public class Static {
	static int a=10;
	
	public static void show() {
		a=70;
	    System.out.println(a);
	}
	public static void display() {
		System.out.println(a);
	}
	static {
		a=50;
	}
}
