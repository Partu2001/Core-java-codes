package fileclass;

import java.util.StringTokenizer;

public class SystemClassDemo {
	public static void main(String[] args) {
		System.out.println("This is normal msg");
		System.err.println("This is error msg");
		
//		String username = System.console().readLine();
//		System.out.println(username);
//		
//		char[] password=System.console().readPassword();
//		System.out.println(password);
//		
		String data="Partu,Tush,Vinit";
		StringTokenizer st=new StringTokenizer(data,",");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
			
			String username="Partu123";
			String mobileno="1234567890";
			
			boolean check=username.matches("[a-z A-Z] +[1-3]");
			System.out.println(check);
			
			boolean check1=mobileno.matches("[0-9]+[10]");
			System.out.println(check1);
		}
	}

}
