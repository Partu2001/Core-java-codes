package colection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(101);
		list.add(102);
		list.add(105);
		list.add(104);
		list.add(103);
		list.add(107);
		list.add(106);
		
		System.out.println(list);
	
		int sum=0;
		for(int num:list) {
			sum +=num;
		}
		System.out.println(sum);
		
		int max=Collections.max(list);
		System.out.println(max);
		
		Collections.reverse( list);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		HashSet<Integer> list2=new HashSet<Integer>(list);
		 
		System.out.println(list2);
	
		
		
	}

}
