package reflection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		map.put(1, "Partu");
		map.put(2, "Partu");
		map.put(null, "Partu");
		map.put(null, "Kumbhar");
		map.put(3, "Partu");
		map.put(3, "Pk");
		
		System.out.println(map);
		Iterator itr=map.keySet().iterator();
		while(itr.hasNext()) {
			Object i=itr.next();
			Object o=map.get(i);
			System.out.println(i +" "+o );
		}
		
		for(Map.Entry e:map.entrySet()) {
			System.out.println(e.getKey() + " " +e.getValue());
		}
	}

}
