package reflection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
	
		SortedSet<Integer> set=new TreeSet<Integer>();
		set.add(101);
		set.add(102);
		set.add(103);
		set.add(104);
		set.add(105);
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet(102));
		System.out.println(set.tailSet(104));
		System.out.println(set.subSet(101, 104));
		System.out.println(set.subSet(105,101));
		
	}
}
