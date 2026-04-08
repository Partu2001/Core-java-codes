package Animal;
import java.util.Scanner;
public class Animal {
	String name,color,sound,food;
	
	Scanner sc=new Scanner(System.in);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", sound=" + sound + ", food=" + food + ", sc=" + sc + "]";
	}

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, String color, String sound, String food, Scanner sc) {
		super();
		this.name = name;
		this.color = color;
		this.sound = sound;
		this.food = food;
		this.sc = sc;
	}
	
	public void accept(){
		System.out.println("Enter animal Details:");
		System.out.println("Enter Name:");
		setName(sc.next());
		System.out.println("Enter Color:");
		setColor(sc.next());
		System.out.println("Enter Sound:");
		setSound(sc.next());
		System.out.println("Enter Food:");
		setFood(sc.next());
	}
	
	public void display() {
		System.out.println("Animal Details:");
		System.out.println("Name:"+getName());
		System.out.println("Color:"+getColor());
		System.out.println("Sound:"+getSound());
		System.out.println("sFood:"+getFood());
	}
	
	
	

}
