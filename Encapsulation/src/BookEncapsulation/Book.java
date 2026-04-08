package BookEncapsulation;
public class Book {
	private String bname,bauther;
	private int bquantity,bprice,btotal;
	
	public Book() {
		
	}
	public Book(String bname,String bauther,int bquantity,int bprice,int btotal) {
             this.bname=bname;
             this.bauther=bauther;
             this.bquantity=bquantity;
             this.bprice=bprice;
             this.btotal=btotal;
}
	public String tostring() {
		return  getBookName() +" " + getBookAuther() + " " + getBookQuantity() + " " +getBookPrice() + " " + getBookTotal(); 
	}
	
	public void setBookName(String bname) {
		this.bname=bname;
	}
	public String getBookName() {
		 return bname;
	}
	
	public void setBookAuther(String bauther) {
		this.bauther=bauther;
	}
	public String getBookAuther() {
		 return bauther;
	}
	
	public void setBookQuantity(int bquantity) {
		this.bquantity=bquantity;
	}
	public int getBookQuantity() {
		 return bquantity;
	}
	
	public void setBookPrice(int bprice) {
		this.bprice=bprice;
	}
	public int getBookPrice() {
		 return bprice;
	}
	public void setBookTotal(int bname) {
		this.btotal=btotal;
	}
	public int getBookTotal() {
		 return  bquantity*bprice;
	}
	
}
