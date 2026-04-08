package a;

public class Constructor {
	public Constructor() {
		System.out.println("I am Partu");
	}
	public Constructor(int a,Constructor obj2) {
		obj2.Print();
		System.out.println(a);
	}
	public void Print() {
		Constructor obj2=new Constructor();
		obj2.Print2();
		System.out.println("I am from Kolhapur");
	}
	public void Print2() {
		System.out.println("Kothali");
	}

}
