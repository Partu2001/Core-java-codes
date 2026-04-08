package account;

import java.util.ArrayList;
import java.util.Iterator;

public class BankMain {
	public static void main(String[] args) {
		ArrayList <Account> list =new ArrayList<Account>();
		list.add(new Account(101,24,"Partu",900000));
		list.add(new Account(102,21,"Tush",100000));
		list.add(new Account(103,28,"Vinit",1000000));
		list.add(new Account(104,26,"Pratik",50000));
		list.add(new Account(105,25,"Prathamesh",700000));
		
		System.out.println(list);
		
		Iterator<Account> itr= list.iterator();
		while(itr.hasNext()) {
			Account a=itr.next();
			System.out.println(a);
		}
		
		
	}

}
