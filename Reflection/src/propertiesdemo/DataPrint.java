package propertiesdemo;
import java.io.FileInputStream;
import java.util.Properties;

public class DataPrint {
	public static void main(String[] args)throws Exception {
		Properties p=new Properties();
		p.load(new FileInputStream("application.properties"));
		String username=p.getProperty("usename");
		String password=p.getProperty("password");
		String url=p.getProperty("url");
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(url);
		
		if(username.equals(username)==password.equals(password)) {
			System.out.println("Data match");
		}
		else {
			System.out.println("Data not matach");
		}
		
	}

}
