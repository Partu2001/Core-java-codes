package innerclass;

public class MainFerrari {
	public static void main(String[] args) {
		Ferrari f=new Ferrari() {
			public void driver(){
				System.out.println("Hamiltonnn");
			}
		};
			f.drive();
	}

}
