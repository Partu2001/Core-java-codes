package arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList list1=new ArrayList();
		list1.add(20);
		list1.add("Demo");
		list1.add(10);
		list1.add(" ");
		System.out.println(list1);
		
		Object listitem=list1.get(1);
		System.out.println(listitem);
		
		System.out.println(list1.get(2));
		
		list1.set(1, "Partu");
		System.out.println(list1);
		
		System.out.println(list1.size());
		
		System.out.println(list1.remove(2));
		
		list1.clear();
		
		boolean check =list1.isEmpty();
		System.out.println(check);
		
	}

}
