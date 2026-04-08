package a;

public class MethodAndConstructorOverloading {
	MethodAndConstructorOverloading(){
		System.out.println("Hello");
	}
	MethodAndConstructorOverloading(int a,int b){
		System.out.println(a+b);
	}
	void add() {
		System.out.println(10+2);
	}
	void add(int a) {
		System.out.println(a);
	}
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c ) {
		System.out.println(a+b+c);
	}
	void add(double a,int b) {
		System.out.println(a+b);
	}
	
	
	

}
