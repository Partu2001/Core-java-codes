package a;
import java.util.Scanner;
public class Book {
	String bookname;
	String authername;
	int quantity;
	int price;
	int totalprice;
	
	Scanner sc=new Scanner(System.in);
	public void ShowData() {
		System.out.println("Enter the Book Name:");
		bookname=sc.next();
		System.out.println("Enter the Auther Name:");
		authername=sc.next();
		System.out.println("Enter the Quantity:");
		quantity=sc.nextInt();
		System.out.println("Enter the Price:");
		price=sc.nextInt();
	}
		public void TotalPrice(){
			totalprice=price*quantity;
			System.out.println("Total Price:" +totalprice);
		} 
		 public void Discount() {
			 if(totalprice>=500) {
				 System.out.println("After Discount price is:" +totalprice*0.5);
			 }
		 }
		
		
	
	}
	


