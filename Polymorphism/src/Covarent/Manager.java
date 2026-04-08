package Covarent;

public class Manager extends Employee {
	
	public void calculateSalary() {
		System.out.println("Salary from employee");
	}
   public void show() {
	System.out.println("Show from Manager");
}
   @Override
     public B showEmployee() {
	   return new B();
}
}
