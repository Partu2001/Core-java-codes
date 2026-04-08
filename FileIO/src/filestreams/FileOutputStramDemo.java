package filestreams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStramDemo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos=new FileOutputStream
				(new File("D:\\partu\\SEED INFOTECH\\Core Java\\FileDemo\\myfile2.txt"));
		String data="I file output Stream";
		for(int i=0;i<data.length();i++) {
			fos.write(data.charAt(i));
		}
		System.out.println("writing done..");
		// TODO Auto-generated method stub

	}

}
