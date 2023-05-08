package test;
import java.util.*;
public class Input {
	public void read(Scanner s, Employee e) {
		System.out.println("Enter The Employee Name : ");
		e.name = s.nextLine();
		System.out.println("Enter The Employee ID : ");
		e.id = s.nextLine();
		System.out.println("Enter The Employee designation : ");
		e.desg = s.nextLine();
		System.out.println("Enter The Employee city : ");
		e.addr.city = s.nextLine();
		System.out.println("Enter The Employee House No : ");
		e.addr.hNo = s.nextLine();
		System.out.println("Enter The Street name : ");
		e.addr.sName = s.nextLine();
		System.out.println("Enter The pin code : ");
		e.addr.pinCode = s.nextInt();
		
	}

}
