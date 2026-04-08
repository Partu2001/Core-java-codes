package animalrtti;

public class Elephant extends Animal {
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("Elephant eating  ");
	}
	
	public void running() {
		System.out.println("Runnibg Elephant");
	}

}
