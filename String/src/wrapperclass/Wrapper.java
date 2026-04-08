package wrapperclass;

public class Wrapper {
	public static void main(String[] args) {
		
		int x=50;
		System.out.println(x);
		
		Integer y=Integer.valueOf(x);
		System.out.println(y);
		
		Integer a=new Integer(20);
		int b=a.intValue();
		System.out.println(b);
		
		String s="20";
		int l=Integer.parseInt(s);
		System.out.println(l);
		
		int m=20;
		Integer n=m;
		System.out.println(n);
	}
}
