package a;

public class Method {
	public void add(){
		System.out.println(7+7);
	}
	
	public void sub(int a,int b) {
		System.out.println(a-b);
	}
	public int mul(int a,int b) {
		return a*b;
	}

	public static void main(String[] args) {
		Method obj=new Method();
		obj.add();
		obj.sub(20, 7);
		int res=obj.mul(5,7);
		
		System.out.println(res);
		// TODO Auto-generated method stub

		
	}

}
