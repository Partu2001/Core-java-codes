package empmanagement;

 public  abstract class EmployeeService {
	protected Employee emp;
	
	public void EmployeeServices(Employee emp) {
		this.emp=emp;
	}
	
	public abstract double calculateBonus();
	
	@Override
	public String toString() {
		return emp.getEmpid() + " " +emp.getName() + " " + emp.getSalary();
	}
	
	
	

}
