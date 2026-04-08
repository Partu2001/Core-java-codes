package chapter2;
public class Factorial {
	public void factorial(int n) {
		int fact=1;
		if(n<0) {
			System.out.println("Number is negative ");
		}else {
			
		}
		for(int i=1;i<=n;i++) {
			fact=fact*i;
	}
		System.out.println(fact);
		
	}
}
