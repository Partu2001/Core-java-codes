package reflection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkdeHashSetDemo {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(101);
		lhs.add(102);
		lhs.add(103);
		lhs.add(101);
		lhs.add(100);
		lhs.add(null);
		
		lhs.add(null);
		System.out.println(lhs);
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(null);
		ts.add(101);
		ts.add(102);
		ts.add(103);
		ts.add(101);
		ts.add(100);
		System.out.println(ts);
	}

}
