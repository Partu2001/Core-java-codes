package reflection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapCRUD {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Partu");
		map.put(2, "Prathmesh");
		
		System.out.println(map);
		
		//get Particular Key
		System.out.println("Enter key to get");
		int key=sc.nextInt();
		System.out.println(map.get(key));
		
		//Update
		System.out.println("Enter Key to get:");
		int key1=sc.nextInt();
		System.out.println("Enter Value:");
		String value=sc.next();
		System.out.println(map.put(key1 ,value));
		System.out.println(map);
		
		//Delete
		System.out.println("Enter key to delete");
		int key2=sc.nextInt();
		map.remove(key2);
		System.out.println(map);
	}

}
