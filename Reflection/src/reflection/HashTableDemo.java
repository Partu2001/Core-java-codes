package reflection;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashTableDemo {
	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(101,"Pk");
		ht.put(102, "PP");
		ht.put(103, "PP");
		ht.put(101, "Partu");
		
		System.out.println(ht);
		
		for(Map.Entry e:ht.entrySet()) {
			System.out.println(e.getKey()+ " " +e.getValue());
		}
		
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>(ht);
		System.out.println(tm);
		System.out.println(tm.descendingMap());
	}
}
