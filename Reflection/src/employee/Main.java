package employee;

import java.util.ArrayList;
import java.util.Collections;

import comparable.CompareById;

public class Main {

	public static void main(String[] args) {
		EmpSalaryComparator e=new EmpSalaryComparator();
		e.setId(101);
		e.setName("Partu");
		e.setAge(24);
		e.setSalary(50000);
		
		EmpSalaryComparator e1=new EmpSalaryComparator();
		e1.setId(102);
		e1.setName("Prathmesh");
		e1.setAge(25);
		e1.setSalary(20000);
		
		ArrayList <EmpSalaryComparator> list=new ArrayList<EmpSalaryComparator>();
		list.add(e);
		list.add(e1);
		
		Collections.sort(list,new CompareBySalary());
		System.out.println(list);
		// TODO Auto-generated method stub

	}

}
