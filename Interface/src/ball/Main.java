package ball;

public class Main {
	public static void main(String[] args) {
		Bounceable b=new Ball();
		b.bounce();

		Moveable m=new Car();
		m.move();
	}
}
