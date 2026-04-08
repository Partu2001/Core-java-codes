package customerEncapsulation;
import java.util.Scanner;
public class CustomerOperations {
	Customer c[]=new Customer[2];
	Scanner sc=new Scanner(System.in);

	public void accept() {
		for(int i=0;i<c.length;i++) {
		System.out.println("Enter Customer Details:");
		System.out.println("Enter Id:");
		c[i].setId(sc.nextInt());
		System.out.println("Enter Age:");
		c[i].setAge(sc.nextInt());
		System.out.println("Enter Name:");
		c[i].setName(sc.next());
		System.out.println("Enter Contact:");
		c[i].setContact(sc.nextLong());
			}
	}
	
	public void display() {
		for(int i=0;i<c.length;i++) {
			if(c[i] !=null) {
		System.out.println("ID:"+c[i].getId());
		System.out.println("Age:"+ c[i].getAge());
		System.out.println( "Name:" +c[i].getName());
		System.out.println( "Contact:"+c[i].getContact());
		}
		}
	}

	
	public void update() {
		System.out.println("Enter id to be updated:");
		int id=sc.nextInt();
		
		for(int i=0;i<c.length;i++) {
			if(c[i].getId()==id) {
				c[i].setId(sc.nextInt());
				System.out.println("Enter Age:");
				c[i].setAge(sc.nextInt());
				System.out.println("Enter Name:");
				c[i].setName(sc.next());
				System.out.println("Enter Contact:");
				c[i].setContact(sc.nextLong());
				
			}
		}
	}
	public void delete() {
		System.out.println("Enter id to be deleted: ");
		int id=sc.nextInt();
		
		for(int i=0;i<c.length;i++) {
			if(c[i].getId()==id) {
				c[i]=null;
			}
		}
	}
}
