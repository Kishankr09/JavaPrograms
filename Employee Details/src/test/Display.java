package test;

public class Display {
	public void dis(Employee e) {
		System.out.println("Name : " + e.name);
		System.out.println("ID : " + e.id);
		System.out.println("designation : "+e.desg);
		System.out.println("city : "+ e.addr.city);
		System.out.println("House No : "+e.addr.hNo);
		System.out.println("Street name : "+e.addr.sName);
		System.out.println("pin code : " + e.addr.pinCode);
	}
}
