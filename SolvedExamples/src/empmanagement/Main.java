package empmanagement;

public class Main {

	public static void main(String[] args) {
		EmployeeService e1=new Manager();
		e1.calculateBonus();
		EmployeeService e2=new Developer();
		e2.calculateBonus();
		// TODO Auto-generated method stub

	}

}
