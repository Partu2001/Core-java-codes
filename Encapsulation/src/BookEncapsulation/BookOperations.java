package BookEncapsulation;
import java.util.Scanner;

public class BookOperations {

    Scanner sc = new Scanner(System.in);
    Book b = new Book();

    public void accept() {
        System.out.println("Enter the Book Details:");

        System.out.println("Enter the Book Name:");
        b.setBookName(sc.nextLine());
        System.out.println("Enter Auther Name:");
        b.setBookAuther(sc.nextLine());
        System.out.println("Enter Book Quantity:");
        b.setBookQuantity(sc.nextInt());
        System.out.println("Enter the Book Price:");
        b.setBookPrice(sc.nextInt());
    }

    public void display() {
        System.out.println("\nThe Book Details:");

        System.out.println("Book Name: " + b.getBookName());
        System.out.println("Author Name: " + b.getBookAuther());
        System.out.println("Book Quantity: " + b.getBookQuantity());
        System.out.println("Book Price: " + b.getBookPrice());
        System.out.println("Book Total: " + b.getBookTotal());
    }
}
