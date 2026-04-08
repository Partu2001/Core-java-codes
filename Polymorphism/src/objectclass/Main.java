package objectclass;

public class Main {

	public static void Main() {
		A a=new A();
		A a1=new A();
		
		System.out.println(a.getClass());
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		System.out.println(a==a1);
		System.out.println(a.name.equals(a1.name));
		// TODO Auto-generated constructor stub
	}

}
