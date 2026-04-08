package empmanagement;

public class Developer extends EmployeeService  {

	@Override
	public double calculateBonus() {
		return emp.getSalary() *0.10;
	}

}
