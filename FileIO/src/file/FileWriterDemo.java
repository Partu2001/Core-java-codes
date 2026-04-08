package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		
		File file=new File("D:\\partu\\SEED INFOTECH\\Core Java\\FileDemo\\myfile.txt");
		
		FileWriter fw=new FileWriter(file);
		String data="I am prathmesh";
		fw.write(data);
		fw.flush();
		System.out.println("Data Saved ");
	    fw.close();
	    
	    FileReader fr=new FileReader(file);
	    int i;
	    while((i=fr.read()) !=-1) {
	    	System.out.print((char)i);
	    }
	}

}
