package reflection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(101, "Partu");
		tm.put(102, "Pk");
		tm.put(102, "Partu");
		tm.put(105, "pp");
		System.out.println(tm);
		
		for(Map.Entry e :tm.entrySet()){
			System.out.println(e.getKey() + " " +e.getValue());
		}
		
		System.out.println(tm.descendingMap());
	}

}
