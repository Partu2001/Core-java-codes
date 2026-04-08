package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Person {
	
	public int id,age;
	public String name,gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, int age, String name, String gender) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	
	
	public void accept() {
		System.out.println("From accept");
	}
	
	public void show() {
		System.out.println("From show");
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person p=new Person();
		p.accept();
		p.show();
		System.out.println(p.getClass());
		Class c=p.getClass();
		
		Field[] f=c.getDeclaredFields();
		for(Field fe:f) {
			System.out.println(fe);
		}
		
		Constructor[] con=c.getDeclaredConstructors();
		for(Constructor c1:con) {
			System.out.println(c1);
		}
		
		Method[] m=c.getDeclaredMethods();
		for (Method m1:m) {
			System.out.println(m1);
		}
		
		Class c2=Class.forName("reflection.Person");
		Method[] m3=c2.getDeclaredMethods();
		for(Method method:m3) {
			System.out.println(method);
		}
		
		Person Person=(Person) Class.forName("eflection.Person").newInstance();
		Person.accept();
	}
}
