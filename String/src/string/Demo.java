package string;
public class Demo {
	
	public static void main(String[] args) {
		String s1="Seed";
		String s2="Seed";
		
		System.out.println(s1.equals(s2));
		String s3=new String("Seed");
		System.out.println(s1==s3);
		System.out.println(s1.toString().equals(s3.toString()));
		
	}

}
