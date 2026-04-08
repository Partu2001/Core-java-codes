package Animal;
import java.util.Scanner;

public class Tiger extends Animal {
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
		return "Tiger [type=" + type + ", sc=" + sc + "]";
	   }
	   public Tiger() {
		// TODO Auto-generated constructor stub
	   }
	   public Tiger(String type, Scanner sc) {
		super();
		this.type = type;
		this.sc = sc;
	   }
	   
	   public void accept() {
		   super.accept();
		   System.out.println("Enter Tiger Details:");
		   System.out.println("Enter Types:");
		   setType(sc.next());
	   }
	   
	   public void display() {
		   super.display();
		   System.out.println("Tiger Details:");
		   System.out.println("Type:"+getType());
	   }
}
