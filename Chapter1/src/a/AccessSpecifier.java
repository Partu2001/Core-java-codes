package a;

public class AccessSpecifier {
	public int x=7;
	int b=10;
	protected int c=17;
	
	public void Constructor() {
		System.out.println("Hello i am Partu");
		
	}
	
	private void print1() {
		System.out.println("I am prathmesh");
		System.out.println(c);
	}
	
	AccessSpecifier a1=new AccessSpecifier();
	
}
