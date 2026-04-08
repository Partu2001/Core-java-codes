public class Student {
    private	int id;
	private String name;
	private String course;
	private int m1,m2,m3,m4,m5;
	char grade; 
	
	public Student() {
		
	}
	
	public Student(int id,String name,String course,int m1,int m2,int m3,int m4,int m5,char grade) {
		this.id=id;
		this.name=name;
		this.course=course;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
		this.grade=grade;
		
	}
	
	public String toString() {
		return getId()+ " " +getName() +" " +getCourse() + " " +getM1() +" " +getM2()+ " " +getM3() + " " +getM4() +" "+getM5()  + " " +getGrade()+" " + getTotal() + " "
				+ getPercentage();
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setCourse(String course) {
		this.course=course;
	}
	public String getCourse() {
		return course;
	}
	
	public void setM1(int m1) {
		this.m1=m1;
	}
	public int getM1() {
		return m1;
	}
	
	public void setM2(int m2) {
		this.m2=m2;
	}
	public int getM2() {
		return m2;
	}
	
	public void setM3(int m3) {
		this.m3=m3;
	}
	public int getM3() {
		return m3;
	}
	
	public void setM4(int m4) {
		this.m4=m4;
	}
	public int getM4() {
		return m4;
	}
	
	public void setM5(int m5) {
		this.m5=m5;
	}
	public int getM5() {
		return m5;
	}
	
	public int getTotal() {
		return m1+m2+m3+m4+m5;
	}
	
	public int getPercentage() {
		return ((getTotal())/500)*100;
	}
	
	public void setGrade(char grade) {
		this.grade=grade;
	}
	
	public char getGrade() {
		int per=getPercentage();
		if(per>=90) {
			return 'A';
		}
		else if(per>=70) {
			return 'B';
		}
		else if(per>=50) {
			return 'C';
		}
		else {
			return 'F';
		}
	}
	
	
}