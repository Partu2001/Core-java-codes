package person;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws AgeInvalidException {	
		Employee e1=new Employee();e1.accept();
		Employee e2=new Employee();e2.accept();
		Employee e3=new Employee();e3.accept();
		Employee e4=new Employee();e4.accept();
		Employee e5=new Employee();e5.accept();
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		 list.add(e1);
         list.add(e2);
         list.add(e3);
         list.add(e4);
         list.add(e5);
		
		 System.out.println("Employee Details:");
		 for(Employee emp:list) {
			 System.out.println(emp);
		 }
         
	}
	
	}


