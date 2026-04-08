package chapter2;

public class Fibnocis {
	
	public void fibnocis(int n) {
		int n1=0;
		int n2=1;
		
		System.out.println("Print the Fibonacis print:");
		for(int i=1;i<=n;i++) {
			System.out.println(n1);
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}

}
