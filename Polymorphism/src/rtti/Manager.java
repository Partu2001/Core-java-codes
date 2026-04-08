package rtti;

public class Manager extends Employee {
	
	@Override
	public void calculateSalary() {
		super.calculateSalary();
		System.out.println("Manager Calculated Salary...");
	}
	
	public void show() {
		System.out.println("This is show method....");
	}

}
