package file;
import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
//		File file=new File("D:\\partu\\SEED INFOTECH\\Core Java\\FileDemo");
//		file.mkdir();
//		System.out.println("File is created");
		
		File file=new File("D:\\partu\\SEED INFOTECH\\Core Java\\FileDemo\\myfile.txt");
		file.createNewFile();
		System.out.println("New txt file created");
		
		file.delete();
		System.out.println("File deleted");
		
		boolean check =file.exists();
		System.out.println(check);
		
		boolean check2=file.canRead();
		System.out.println(check2);
		
		System.out.println(file.length());
		
		// TODO Auto-generated method stub

	}

}
