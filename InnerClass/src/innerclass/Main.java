package innerclass;

public class Main {

	public static void main(String[] args) {
		Outer o=new Outer();
		o.A();
		
		Outer.Inner i=new Outer().new Inner();
		i.B();
		// TODO Auto-generated method stub

	}

}
