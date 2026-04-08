package a;

public class StaticMethod {
	private static int count;
	public static int show() {
		return count;
	}


public static void main(String [] args) {
	int ShowCount=StaticMethod.show();
	System.out.println(ShowCount);
	
}
}
