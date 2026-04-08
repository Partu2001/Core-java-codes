package addingMethods;

public interface C {
	
	default void display() {
		System.out.println("This is display from C ");
	}
	
	public static void view() {
		System.out.println("This is view from C");
	}

}
