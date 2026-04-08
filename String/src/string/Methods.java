package string;

public class Methods {
	public static void main(String[] args) {
		String s1="Partu ";
		String s2="Kumbhar";
		
		System.out.println(s1.length());
		
		System.out.println(s1.replace('P', 'T'));
		
		System.out.println(s1.replaceAll("Partu", "Prathmesh"));
		
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.isEmpty());
		
		System.out.println(s2.isBlank());
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s2.toLowerCase());
		
		System.out.println(s1.charAt(3));
		
	    System.out.println(s1.substring(4));
	}
}
