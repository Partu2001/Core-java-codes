package crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Employee e=new Employee();
		e.accept();
		
		Employee e1=new Employee();
		e1.accept();
		
	    ArrayList<Employee> list1=new ArrayList<Employee>();
	    
	    //Addding Data
	    list1.add(e);
	    list1.add(e1);
	    
	    //Show Data
	    for(Employee employee:list1) {
	    	System.out.println(employee);
	    }
	    
	    //Update Data
	    System.out.println("Enter Id to Update");
	    int updateId=sc.nextInt();
	    
	    Iterator<Employee> itr=list1.iterator();
	    while(itr.hasNext()) {
	    	Employee e2=itr.next();
	    	if(e2.getId()==updateId) {
	    		System.out.println("Enter name To Update:");
	    		e2.setName(sc.next());
	    	}
	    }
	    
	    //Show data after Updated
	    for(Employee employee:list1) {
	    	System.out.println(employee);
	    }
	    
	    //Delete Data
	    System.out.println("Enter Id to Delete: ");
	    int deleteId=sc.nextInt();
	    
	    Iterator<Employee> itr2=list1.iterator();
	    while(itr2.hasNext()) {
	    	Employee e3=itr2.next();
	    	if(e3.getId()==deleteId) {
	    		itr2.remove();
	    		System.out.println(itr2);
	    	}
	    }
	    
	    //Show Data After Delete
	    for(Employee employee:list1) {
	    	System.out.println(employee);
	    }
	}
}
