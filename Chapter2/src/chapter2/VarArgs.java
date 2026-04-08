package chapter2;

public class VarArgs {
 public static void add(int ...a) {
	 int sum=0;
	 for(int i=0;i<a.length;i++) {
		 sum+=a[i];
	 }
	 System.out.println(sum);
	 
 }
}
