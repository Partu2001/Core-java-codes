package Covarent;

public class Main {

	public static void main(String[] args) {
		Employee e=new Manager();
		e.display();
		
		Manager m=new Manager();
		B b1=m.showEmployee();
     	System.out.println(b1);
		// TODO Auto-generated method stub

	}

}

