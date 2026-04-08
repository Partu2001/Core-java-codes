package chapter2;

public class MainGarbageCollection {
	public static void main(String[] args) {
		GarbageCollection g=new GarbageCollection();
		g=null;
		System.out.println(g);
		System.gc();
		System.out.println(g);
	}

}
