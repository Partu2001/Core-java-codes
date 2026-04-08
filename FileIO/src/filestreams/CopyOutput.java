package filestreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;

public class CopyOutput {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream
				     (new File("D:\\partu\\SEED INFOTECH\\Core Java\\FileDemo\\myfile2.txt"));
		FileOutputStream fos=new FileOutputStream
				(new File("D:\\partu\\SEED INFOTECH\\Core Java\\FileDemo\\myfile3.txt")) ;
	    int i;
		while((i=fis.read()) !=-1) {
			System.out.print((char)i);
			fos.write((char)i);
		}
		
		
		// TODO Auto-generated method stub

	}

}
