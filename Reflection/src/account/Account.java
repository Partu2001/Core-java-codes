package account;

public class Account {
	int id,age;
	String name;
	double balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int id, int age, String name, double balance) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", age=" + age + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
	

}
