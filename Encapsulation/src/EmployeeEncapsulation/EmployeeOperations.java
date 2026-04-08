package EmployeeEncapsulation;
import java.util.Scanner;

public class EmployeeOperations {
	Employee p=new Employee();
	
	double da,hra,tra,pt,pf,gross,net;
	
	Scanner sc=new Scanner(System.in);
	
	//Method to accept
	public void accept() {
		System.out.println("enter id: ");
		p.setID(sc.nextInt());
		System.out.println("Enter name: ");
		p.setName(sc.next());
		System.out.println("Enter post: ");
		p.setPost(sc.next());
		System.out.println("Enter qualification: ");
		p.setQua(sc.next());
		System.out.println("Enter basic salary:  ");
		p.setBasesal(sc.nextFloat());
	}
	
	//method to calculate :
	public void calda() {
		da=0.15*p.getBasesal();
		da=p.getDa();
	}
	
	public void calhra() {
		hra=p.getBasesal()*0.5;
		hra=p.getHra();
	}
	public void caltra() {
		tra=p.getBasesal()*0.10;
		tra=p.getTra();
	}
	public void calpt() {
		pt=0.12*p.getBasesal();
		pt=p.getPt();
	}
	public void calpf() {
		pf=0.10*p.getBasesal();
		pf=p.getPf();
	}
	public void gross() {
		gross=p.getBasesal()+p.getDa()+p.getHra()+p.getTra();
		gross=p.getGross();
	}
	public void net() {
		net=p.getGross()-(p.getPt()+p.getPf());
		net=p.getNet();
	}
	
	
	
	//method to display
	public void display() {
		System.out.println("======Employee details are as follows======");
		System.out.println("Name: "+p.getName());
		System.out.println("ID: "+p.getID());
		System.out.println("Post: "+p.getPost());
		System.out.println("Qualification: "+p.getQua());
		System.out.println("Basic salary: "+p.getBasesal());
		System.out.println("Hra: "+p.getHra());
		System.out.println("Da: "+p.getDa());
		System.out.println("Tra: "+p.getTra());
		System.out.println("Pt: "+p.getPt());
		System.out.println("Pf: "+p.getPf());
		System.out.println("Gross salary: "+p.getGross());
		System.out.println("Net salary: "+p.getNet());
	}
	
	
	
	

}