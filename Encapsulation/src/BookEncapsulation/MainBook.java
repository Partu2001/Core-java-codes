package BookEncapsulation;

public class MainBook {

	public static void main(String[] args) {
		BookOperations b1=new BookOperations();
		BookOperations b2=new BookOperations();
		
		b1.accept();
		b1.display();
		
		b2.accept();
		b2.display();

		// TODO Auto-generated method stub

	}

}
