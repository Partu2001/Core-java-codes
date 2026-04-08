package shape;
import java.util.Scanner;
public class Cylinder extends Shape {
	
		private double radius,height;
		
		Scanner sc=new Scanner(System.in);
		
		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}
		
		@Override
		public String toString() {
			return "Cylinder [radius=" + radius + ", height=" + height + "]";
		}
		
	    public Cylinder(){
			
		}
		
		public Cylinder(double radius, double height) {
			super();
			this.radius = radius;
			this.height = height;
		}
		
		@Override
		public void draw() {
			System.out.println("This is cylinder....");
		} 
		
		@Override
		public double calculateArea() {
			System.out.println("Enter radius: ");
			setRadius(sc.nextDouble());
			System.out.println("Enter height: ");
			setHeight(sc.nextDouble());
			return 2*3.14*getRadius()*getHeight();
		}
	}

