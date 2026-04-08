package empmanagement;

public class Manager extends EmployeeService {
	
	@Override
	public double calculateBonus() {
		return emp.getSalary() *0.20;
	}

}
