package addingMethods;

public interface A {
	
	public void show();

	default void display() {
		System.out.println("This is diplay from A");
	}
	
	public static void view() {
		System.out.println("This is view  from A ");
	}
}
