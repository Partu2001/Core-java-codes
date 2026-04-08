package shape;

public class Circle extends Shape {
	double radius=5;
	float pi=3.14f;
	double area;

	@Override
	public void area() {
		area=pi*radius*radius;
		System.out.println("Area of Circle:" +area);
		
	}
}
