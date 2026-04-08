package serilization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationDemo {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos=new FileOutputStream
				(new File("D:\\partu\\SEED INFOTECH\\Core Java\\FileDemo\\myfile4.txt"));
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Employee e=new Employee(101,123456,"Partu",12346976L);
		
		oos.writeObject(e);
		System.out.println("Object inserted....");
		
		oos.close();
		
	}
	

}
