package Examples;

public class ToDo {
	public  void Factorial(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
			System.out.println("Factorial:"+fact);
		}
	}
	     int Square(int a) {
		return a*a;
	}
	    static int  Sum() {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum=sum+i;
		}
		return sum;
	}
	static void  Table(int n) {
		for(int i=1;i<=10;i++ ) {
			System.out.println(n+ i + (n*i));
		}
	}

}
