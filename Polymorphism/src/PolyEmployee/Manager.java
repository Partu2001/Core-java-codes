package PolyEmployee;

public class Manager extends Employee {
       double salary=50000;
	
	@Override
	public double display() {
		return this.salary +super.salary;
	}
}
