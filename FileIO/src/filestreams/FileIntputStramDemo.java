package filestreams;

import java.io.File;
import java.io.IOException;

import java.io.FileInputStream;

public class FileIntputStramDemo {
	public static void main(String[] args) throws IOException {
		
		String filepath="D:\\partu\\SEED INFOTECH\\Core Java\\FileDemo\\myfile2.txt";
		FileInputStream fis=null;
		
		try {
		fis=new FileInputStream(new File(filepath));
		int i;
		while((i=fis.read()) !=-1) {
			System.out.print((char)i);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			fis.close();
		}
	}

}
