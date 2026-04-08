package Examples;

public class Rectangle {
	private int width;
	private int height;
	
	Rectangle(){
		width=10;
		height=30;
	}
	Rectangle(int width,int height){
		width=this.width;
		height=this.height;
	}
	public void Print() {
		System.out.println("Width:" +width + "Height:" +height);
	}

}
