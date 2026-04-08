package animalrtti;

public class LivingBeing {
	public static void main(String[] args) {
		Animal a=new Tiger();
		a.eat();
		
		Animal a1=new Elephant();
		Elephant e=(Elephant)a1;
		e.eat();
		e.running();
		
		if(e instanceof Animal) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	
	}
}
