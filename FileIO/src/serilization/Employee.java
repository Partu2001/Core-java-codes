package serilization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Employee implements Externalizable {
	int id,otp;
	String name;
	transient long  passowrd;
	
	public Employee() {
		super();
		
	}
	
	public Employee(int id, int otp, String name, long passowrd) {
		super();
		this.id = id;
		this.otp = otp;
		this.name = name;
		this.passowrd = passowrd;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", otp=" + otp + ", name=" + name + ", passowrd=" + passowrd + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(this.name);
		out.writeObject(this.id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name=(String) in.readObject();
		id=(int) in.readObject();
		
		
	}
	
	
	
	

}
