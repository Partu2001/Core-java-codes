package clone;

public class A {
	int id;
	String name;
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public Object clone() {
		Address adr=new Address();
		adr.setCity("Pune");
		adr.setPincode(416101);
		
		A a=new A(101,"Pune");
		return a;
	}
	
	
	
	

}
