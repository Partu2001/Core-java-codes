package employee;

public class Main{

	public static void main(String[] args) {
		
		Manager m= new Manager();
		m.accept();
		m.calGrossSalary();
		m.calnetSalary();
		m.allowance();
		m.total();
		m.netSalary();
		m.display();
		

		MarketingExecutive m1=new MarketingExecutive();
		m1.accept();
		m1.calGrossSalary();
		m1.calnetSalary();
		m1.otherAllowance();
		m1.alltotal();
		m1.netSalary();
		m1.display();
	}

}
