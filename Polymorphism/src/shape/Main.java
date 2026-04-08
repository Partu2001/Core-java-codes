package shape;

public class Main {
		public static void main(String[] args) {
			Shape e=new Circle();
			e.draw();
			Shape s=new Cylinder();
			s.draw();
			System.out.println("Area of Cylinder : " +s.calculateArea());
			}
	}

