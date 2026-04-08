package interfacefirst;

   public class  Employee implements A {
	
	int id=101;
	String name="Partu";
	
	public String toString() {
		return id+ " "+ name;
	}
	
	public void print() {
		System.out.println(toString());
		
	}

}
