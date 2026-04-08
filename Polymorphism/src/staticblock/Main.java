package staticblock;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello from main");
		A a=new B();
		a.show();	
	}
	public static void main() {
		System.out.println("Hello from main 2....");
		Main.main();
		// TODO Auto-generated method stub
	}
}
