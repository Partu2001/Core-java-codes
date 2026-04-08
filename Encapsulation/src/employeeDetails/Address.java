package employeeDetails;
public class Address {
	String area,city,state,district;
	int pincode,houseno;
	
	public Address() {
		
	}
	public Address(String area,String city,String state,String district,int pincode,int houseno) {
		this.area=area;
		this.city=city;
		this.state=state;
		this.district=district;
		this.pincode=pincode;
		this.houseno=houseno;
	}
	
	public String toString() {
		return area+ " " +city +" " +state +" " +district + " " +pincode + " " +houseno;
	}

}
