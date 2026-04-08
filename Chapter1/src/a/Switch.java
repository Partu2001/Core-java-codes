package a;
import java.util.Scanner;
public class Switch {

			public static void main(String args[]) {
				int num1;
				int num2;
				int option;
				
				Scanner sc=new Scanner(System.in);
				
				do {
				System.out.println("Enter First Number:");
				num1=sc.nextInt();
				System.out.println("Enter Second Number:");
				num2=sc.nextInt();
				System.out.println("1.Add,2.Sub,3.Mul,4.Div,0.Exit");
				option=sc.nextInt();
				
				
				switch(option){
				case 1:
					System.out.println(num1+num2);
					break;
				
				case '2':
					System.out.println(num1-num2);
					break;
				
				case '3':
					System.out.println(num1*num2);
					break;
				
				case '4':
					System.out.println(num1/num2);
					break;
				
				case '0':
				System.out.println("Exit");
				
				

				default:
					System.out.println("Invalid Input");
				}
					
				}while(option!=0);
				
				
			
			}
}

		// TODO Auto-generated method stub	}


