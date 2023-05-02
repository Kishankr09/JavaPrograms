import java.util.Scanner;
class EmpDetail{
	int empID,empSal;
	String empName, empAdd;
	EmpDetail(String name, String address,int id,int sal){
		empName = name;
		empAdd =address;
		empID =id;
		empSal = sal;
	}
	String getEmpDetail() {
		return "Employee Id : " + empID + "\nEmployee Name : "+empName+ "\nEmployee Address : " +empAdd+"\nEmployee Sal : " + empSal;
	}
	
}

class Show{
	void dis(EmpDetail e) {
		System.out.println(e.getEmpDetail());
	}
}
public class EmpDataDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Employee Name : ");
		String name = s.nextLine();
		System.out.println("Enter The Employee Address : ");
		String ad = s.nextLine();
		System.out.println("Enter The Employee ID : ");
		int id = s.nextInt();
		System.out.println("Enter The Employee Salary : ");
		int sal = s.nextInt();
		EmpDetail emp = new EmpDetail(name,ad,id,sal);
		Show sw = new Show();
		sw.dis(emp);
	}

}
