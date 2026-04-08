package arraylist;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList list1=new LinkedList();
		list1.add("Partu");
		list1.add(7);
		list1.add("Mahi");
		System.out.println(list1);
		list1.offer("Hiii");
		System.out.println(list1);
		
	}
}
