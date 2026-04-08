package customerEncapsulation;
public class Customer {
	private int id,age;
	private String name;
	private long contact;
	
	public Customer() {
		
	}
	public Customer(int id,int age,String name,long contact) {
		this.id=id;
		this.age=age;
		this.name=name;
		this.contact=contact;
	}
	 public String toString() {
		 return "[Customer Details:" +getId() +" " +getAge()+" " + getName() +" " + getContact() + "]"; 
	 }
	 
	 public void setId(int id) {
		 this.id=id;
	 }
	 public int getId() {
		 return id;
	 }
	 
	 public void setAge(int age) {
		 this.age=age;
	 }
	 public int getAge() {
		 return age;
	 }
	 
	 public void setName(String name) {
		 this.name=name;
	 }
	 public String getName() {
		 return name;
	 }
	 
	 public void setContact(long contact) {
		 this.contact=contact;
	 }
	 public long getContact() {
		 return contact;
	 }

}
