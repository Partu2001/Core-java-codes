package colection;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101, "Partu");
		hm.put(102, "Kumbhar");
		hm.put(103, "Pk");
		hm.put(104, "Vinit");
		hm.put(105, "Tush");
		
		System.out.println(hm);
		
		System.out.println(hm.get(103));
		
		hm.remove(hm);
		System.out.println(hm);
		
	}
}
