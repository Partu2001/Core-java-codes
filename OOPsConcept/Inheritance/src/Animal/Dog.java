package Animal;
import java.util.Scanner;

public class Dog extends Animal {
          String type;
          
          Scanner sc=new Scanner(System.in);

		  public String getType() {
			  return type;
		  }

		  public void setType(String type) {
			  this.type = type;
		  }

		  public Scanner getSc() {
			  return sc;
		  }

		  public void setSc(Scanner sc) {
			  this.sc = sc;
		  }

		  @Override
		  public String toString() {
			return "Dog [type=" + type + ", sc=" + sc + "]";
		  }

		  public Dog() {
			// TODO Auto-generated constructor stub
		  }

		  public Dog(String type, Scanner sc) {
			super();
			this.type = type;
			this.sc = sc;
		  }
		  
		  
		  public void accept() {
			  super.accept();
			  System.out.println("Enter Dog Details:");
			  System.out.println("Enter Type:");
			  setType(sc.next());
			  
		  }
		  
		  public void display() {
			  super.display();
			  System.out.println("Dog Details:");
			  System.out.println("Type:"+getType());
		  }
          
          
}
