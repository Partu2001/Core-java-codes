package inheritance;
import java.util.Scanner;
public class Developer extends Employee {
	
	int did,team_member;
	String proglang;
      Scanner sc=new Scanner(System.in);
	  public int getDid() {
		  return did;
	  }
	  public void setDid(int did) {
		  this.did = did;
	  }
	  public int getTeam_member() {
		  return team_member;
	  }
	  public void setTeam_member(int team_member) {
		  this.team_member = team_member;
	  }
	  public String getProglang() {
		  return proglang;
	  }
	  public void setProglang(String proglang) {
		  this.proglang = proglang;
	  }
	  
	  @Override
	  public String toString() {
		return "Developer [did=" + did + ", team_member=" + team_member + ", proglang=" + proglang + "]";
	  }
	  
	  public Developer() {
		// TODO Auto-generated constructor stub
	  }
	  
	  public Developer(String department, String qualification, int salary, int did, int team_member, String proglang) {
		super(department, qualification, salary);
		this.did = did;
		this.team_member = team_member;
		this.proglang = proglang;
	  }
	  
	  
	  public void acceptDeveloper() {
		  System.out.println("Enter Developer Details:");
			System.out.println("Enter did:");
			setDid(sc.nextInt());
			System.out.println("Ente Team Members:");
			setTeam_member(sc.nextInt());
			System.out.println("Enter programming language:");
			setProglang(sc.next());
		}
	  
	  public void displayDeveloper() {
		  System.out.println("Developer Details:");
			System.out.println(" Did:" +getDid());
			System.out.println("Ente Team Members:" +getTeam_member());
			System.out.println("Enter programming language:" +getProglang());
	  }
	}
	 
      
      

