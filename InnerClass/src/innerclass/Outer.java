package innerclass;

public class Outer {
	
	public void A() {
	System.out.println("This from outer......");
	}
	
	public class Inner{
		public void B() {
			System.out.println("This from Inner.....");
		}
	}
}
