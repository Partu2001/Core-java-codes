package stack;

public class MyStack {
	private int s1;
	private String s2;
	
	public MyStack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyStack(int s1, String s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}

	public int getS1() {
		return s1;
	}

	public void setS1(int s1) {
		this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

	@Override
	public String toString() {
		return "MyStack [s1=" + s1 + ", s2=" + s2 + "]";
	}
	
	
	
	

}
