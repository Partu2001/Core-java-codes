package reflection;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(101);
		list.add(105);
		list.add(104);
		list.add(103);
		list.add(102);
		list.add(106);
		list.add(107);
		
		System.out.println("Before sorting:");
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println("After sorting:");
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("After Descending");
		System.out.println(list);
		
		System.out.println("**************************************");
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("a");
		list1.add("p");
		list1.add("b");
		list1.add("f");
		list1.add("e");
		list1.add("d");
		list1.add("c");
		
		System.out.println("Before Sorting:");
		System.out.println(list1);
		
		Collections.sort(list1);
		
		System.out.println("After Sorting:");
		System.out.println(list1);
		
	}

}
