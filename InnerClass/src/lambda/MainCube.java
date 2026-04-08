package lambda;

public class MainCube {
	public static void main(String[] args) {
		Cube c=(a) ->a*a*a;
		System.out.println("Cube: "+c.cube(7));
	
}

}
