package test;

public class Display {
	public void show(Student st) {
		System.out.println("-------Student Details-------");
		System.out.println("Roll No : " + st.rollNo);
		System.out.println("Name : " + st.name);
		System.out.println("Branch : " + st.branch);
		System.out.println("House No : " + st.addr.houseNo);
		System.out.println("Street Name : " + st.addr.streetName);
		System.out.println("PinCode : " + st.addr.pinCode);
		System.out.println("City : " + st.addr.city);
		System.out.println("Mail Id : " + st.con.mailId);
		System.out.println("Phone No : " + st.con.phNo);
		System.out.println("-------Student Marks-------");
		System.out.println("Total Marks : " +st.totMarks);
		System.out.println("Percentage : " + st.per);
		System.out.println("Result : " + st.res);
	}
}
