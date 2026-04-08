package chapter2;

public class PassingValue {
	int n1,n2,n3;
	PassingValue(){
		
	} 
	PassingValue(int n1,int n2, int n3){
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;	
	}
	public String toString() {
		return n1 +" " +n2 +" " +n3;
	}
	public static void swap(PassingValue d1,PassingValue d2) {
		
	}
	public static void main(String[] args) {
		PassingValue d1=new PassingValue(1,2,3);
		PassingValue d2=new PassingValue(4,5,6);
		
		System.out.println("Before Swapping:"+ d1 +d2);
		PassingValue temp;
		temp=d1;
		d1=d2;
		d2=temp;
		
		PassingValue.swap(d1,d2);
		
		System.out.println("After Swapping:" + d1 +d2);
		// TODO Auto-generated method stub
	}
}



