package employee;

public class Manager extends Employee {
     private double petrol,food,other,netsalary,total;
	
	public double getPetrol() {
		return petrol;
	}

	  public void setPetrol(double petrol) {
		  this.petrol = petrol;
	  }

	  public double getFood() {
		  return food;
	  }

	  public void setFood(double food) {
		  this.food = food;
	  }

	  public double getOther() {
		  return other;
	  }

	  public void setOther(double other) {
		  this.other = other;
	  }

	
	@Override
	public String toString() {
		return "Manager [petrol=" + petrol + ", food=" + food + ", other=" + other + "]";
	}

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(double petrol, double food, double other) {
		super();
		this.petrol = petrol;
		this.food = food;
		this.other = other;
	}

	public void allowance() {
	this. petrol=0.08* getSalary();
	 this.food=0.13* getSalary();
	this. other=0.03*getSalary();
	}
	
	public void total() {
	   total=this.petrol+this.food+this.other;
	}
	
	public void netSalary() {
		double pf=0.12*getSalary();
		netsalary=getSalary()+total-pf;
	}
	
	public void display() {
		super.display();
		System.out.println("Petrol Allownace :" +petrol);
		System.out.println("Food Allowance:" +food);
		System.out.println("Other Allowamce:" +other);
		System.out.println("Total:" +total);
		System.out.println("Net salary:" +netsalary);
	}

}
