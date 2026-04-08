package customerEncapsulation;
import java.util.Scanner;;
public class MainCustomerOperations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CustomerOperations c1=new CustomerOperations();
		int choice;
//		c1.accept();
//		c1.display();
//      c1.update();
//		c1.display();
//		c1.delete();
//		c1.display();
		//	Customer c=new Customer();
		
		do {
			System.out.println("Enter your choice:");
			System.out.println("1.Insert");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Display");
			System.out.println("0.Exit");
		    choice=sc.nextInt();
		    
		    switch(choice) {
		    case 1:c1.accept();
		    break;
		    
		    case 2:c1.update();
		    break;
		    
		    case 3:c1.delete();
		    break;
		    
		    case 4:c1.display();
		    break;
		    
		    case 0: System.out.println("Program Termonated.");
		    break;
		    
		    default: System.out.println("Invalid...");
		    }
		   
 }while(choice!=0);
		
}
}
