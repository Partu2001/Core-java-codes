package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(101);
		e.setName("Partu");
		e.setAge(24);
		e.setPost("It");
		
		Employee e1=new Employee();
		e1.setId(102);
		e1.setName("PK");
		e1.setAge(23);
		e1.setPost("Bank");
		
		ArrayList<Employee> list1=new ArrayList<Employee>();
		list1.add(e);
		list1.add(e1);
		
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println(list1);
		
		Collections.sort(list1,new CompareById());
		System.out.println(list1);
		
		Collections.sort(list1,new CompareByName());
		System.out.println(list1);
		
		Collections.sort(list1,((o1,o2) -> Integer.compare (o1.getId(), o2.getId())));
		System.out.println(list1);
		
		Collections.sort(list1,((o1,o2) ->o1.getName() .compareTo(o2.getName())));
		System.out.println(list1);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
