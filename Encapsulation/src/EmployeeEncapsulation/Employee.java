 package EmployeeEncapsulation;
public class Employee {
	private int id;
	private String name;
	private String post;
	private String qualification;
	private float basesal;
	private double da;
	private double hra;
	private double tra;
	private double pt;
	private double pf;
	private double gross;
	private double net;
	
	
	public Employee() {
		
	}
	public Employee(int id ,String name,String post,String qualification,float basesal,double da,double hra,double tra,double pt,double pf,double gross,double net) {
		this.id=id;
		this.name=name;
		this.post=post;
		this.qualification=qualification;
		this.basesal=basesal;
		this.da=da;
		this.hra=hra;
		this.pt=pt;
		this.pf=pf;
		this.tra=tra;
		this.gross=gross;
		this.net=net;
	}
	public String toString() {
		return id+" "+name+" "+post+" "+qualification+" "+basesal;
	}
	public void setID(int id) {
		this.id=id;
	}
	public int getID() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setPost(String post) {
		this.post=post;
	}
	public String getPost() {
		return post;
	}
	public void setQua(String qualification) {
		this.qualification=qualification;
	}
	public String getQua() {
		return qualification;
	}
	public void setBasesal(float basesal) {
		this.basesal=basesal;
	}
	public float getBasesal() {
		return basesal;
	}
	public void setDa(double da) {
		this.da=da;
	}
	public double getDa() {
		return 0.15*basesal;
	}
	public void setHra(double hra) {
		this.hra=hra;
	}
	public double getHra() {
		return 0.5*basesal;
	}
	public void setTra(double tra) {
		this.tra=tra;
	}
	public double getTra() {
		return 0.10*basesal;
	}
	public void setPt(double pt) {
		this.pt=pt;
	}
	public double getPt() {
		return 0.12*basesal;
	}
	public void setPf(double pf) {
		this.pf=pf;
	}
	public double getPf() {
		return 0.10*basesal;
	}
	public void setGross(double gross) {
		this.gross=gross;
	}
	public double getGross() {
		return basesal+da+hra+tra;
	}
	public void setNet(double net) {
		this.net=net;
	}
	public double getNet() {
		return basesal-(pt+pf);
	}





}