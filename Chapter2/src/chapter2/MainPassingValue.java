package chapter2;

public class MainPassingValue {

	public static void main(String[] args) {
		PassingValue d1=new PassingValue(1,2,3);
		PassingValue d2=new PassingValue(4,5,6);
		
		System.out.println("Before Swapping:"+ d1 +d2);
		
		PassingValue.swap(d1,d2);
		
		System.out.println("After Swapping:" + d1 +d2);
		// TODO Auto-generated method stub

	}

}
