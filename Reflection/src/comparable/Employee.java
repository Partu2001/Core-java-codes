package comparable;

public class Employee implements Comparable<Employee> {
	int id,age;
	String name,post;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, int age, String name, String post) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.post = post;
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
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", post=" + post + "]";
	}
	
	@Override
	public int compareTo(Employee o) {
		return Integer.compare(o.getId(),this.getId());
	}

}
