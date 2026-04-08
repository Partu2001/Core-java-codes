package inheritance;
import java.util.Scanner;
public class Manager extends Employee {
	int mid;
	int team_menber;
	
	Scanner sc=new Scanner(System.in);

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getTeam_menber() {
		return team_menber;
	}

	public void setTeam_menber(int team_menber) {
		this.team_menber = team_menber;
	}

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", team_menber=" + team_menber + "]";
	}

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String department, String qualification, int salary, int mid, int team_menber) {
		super(department, qualification, salary);
		this.mid = mid;
		this.team_menber = team_menber;
	}
	
	
	public void acceptManager() {
		System.out.println("Enter Manager Details:");
		System.out.println("Enter mid:");
		setMid(sc.nextInt());
		System.out.println("Ente Team Members:");
		setTeam_menber(sc.nextInt());
	}
	
	public void displayManager() {
		System.out.println("Manager Details:");
		System.out.println("Enter:"+ getMid());
		System.out.println("Team Members:" +getTeam_menber());
	}
	
	
	

}
