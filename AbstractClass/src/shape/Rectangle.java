package shape;

public class Rectangle extends Shape {
	int length=5,breadth=7,area;
	
	@Override
	public void area() {
		area=length*breadth;
		System.out.println("Area of Rectangle:" +area);
		
	}

}
