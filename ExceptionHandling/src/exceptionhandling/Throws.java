package exceptionhandling;

import java.io.FileReader;

public class Throws {
	
		public void div1() throws Exception {
			div();
		}
		
		public void div() throws Exception{
			System.out.println(100/0);
			FileReader fr=new FileReader("");
			
		}
	
	public static void main(String[] args) throws Exception {
		Throws a=new Throws();
		a.div1();
	}

}
