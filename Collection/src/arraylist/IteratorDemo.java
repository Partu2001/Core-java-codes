package arraylist;

import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorDemo {
	public static void main(String[] args) {
		LinkedList<Integer>  list=new LinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		ListIterator itr1=list.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println(itr1.hasPrevious());
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		

		
	}

}
