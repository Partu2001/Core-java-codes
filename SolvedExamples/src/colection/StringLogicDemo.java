package colection;
	
import java.util.Scanner;

	public class StringLogicDemo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");

	        String str = sc.nextLine();

	        String reversed = "";

	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i);
	        }

	        int count = 0;
	        for (int i = 0; i < str.length(); i++) {
	            char ch = Character.toLowerCase(str.charAt(i));
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                count++;
	            }
	        }

	        System.out.println("Reversed String: " + reversed);
	        System.out.println("Number of Vowels: " + count);
	    }
	}


