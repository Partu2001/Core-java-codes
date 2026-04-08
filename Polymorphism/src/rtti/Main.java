package rtti;

public class Main {

	public static void main(String[] args) {
		Employee e=new Manager();
		
		Manager m=(Manager)e;
		m.calculateSalary();
		m.show();

	}
}
