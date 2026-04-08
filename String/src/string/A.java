package string;
import java.util.Optional;

public class A {
	public static void main(String[] args) {
		String str[]=new String[5];
		str[0]="A";
		str[1]="B";
		str[2]="C";
		str[3]="D";
		str[4]="E";
		
		Optional<String> o=Optional.ofNullable(str[4]);
		if (o.isPresent()) {
			for (int i=0;i<str.length;i++) {
				String str1=str[i].toLowerCase();
				System.out.println(str1);
				}
		}
		else {
			System.out.println("String is null");
		}
	}

}
