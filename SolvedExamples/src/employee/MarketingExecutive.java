package employee;

public class MarketingExecutive extends Employee {
	private double traveled=10,tour,telephone=1500,total,netsalary;
	
	public double getTraveled() {
		return traveled;
	}

	public void setTraveled(double traveled) {
		this.traveled = traveled;
	}

	public double getTour() {
		return tour;
	}

	public void setTour(double tour) {
		this.tour = tour;
	}

	public double getTelephone() {
		return telephone;
	}

	public void setTelephone(double telepjone) {
		this.telephone = telepjone;
	}

	@Override
	public String toString() {
		return "MarketingExecutive [traveled=" + traveled + ", tour=" + tour + ", telephone=" + telephone + "]";
	}

	public MarketingExecutive() {
		// TODO Auto-generated constructor stub
	}



	public MarketingExecutive(double traveled, double tour, double telephone) {
		super();
		this.traveled = traveled;
		this.tour = tour;
		this.telephone = telephone;
	}

	public void otherAllowance() {
		this.tour=5*getTraveled();
}
	public void alltotal() {
		total=tour+telephone;
	}
	
	public void netSalary() {
		double pf=0.12*getSalary();
		netsalary=getSalary()+total-pf;
	}
	
	public void display() {
		super.display();
		System.out.println("Traveld KM:" +getTraveled());
		System.out.println("Tour:" +tour);
		System.out.println("Telephone:"+getTelephone());
		System.out.println("Total:" +total);
		System.out.println("Net Salary:"+ netsalary);
	}
}
