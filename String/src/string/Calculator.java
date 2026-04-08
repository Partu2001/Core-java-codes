package string;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();
	        
	        sc.nextLine();

	        System.out.print("Enter operation: (1.Add, 2.Subtract, 3.Multiply, 4.Divide): ");
	        String operation = sc.nextLine();

	        int result;

	        switch(operation)
	        {
	            case "1":
	                result = a + b;
	                break;

	            case "2":
	                result = a - b;
	                break;

	            case "3":
	                result = a * b;
	                break;

	            case "4":
	                result = a / b;
	                break;

	            default:
	                System.out.println("Invalid operation");
	                return;
	        }

	        System.out.println("Result = " + result);
	    }
	}