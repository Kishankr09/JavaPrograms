import java.util.Scanner;
class Student{
	int rollNo;
	String sName,sAdd,sBranch;
	
	Student(String n,String sAd,String br,int r){
		rollNo = r;
		sName = n;
		sAdd = sAd;
		sBranch = br;
	}
	String getDetails() {
		return "Roll No : " + rollNo +"\nStudent Name : " + sName + "\nStudent Address : " + sAdd + "\nStudent Branch : " + sBranch;
	}
}

class Display2{
	void dis(Student st) {
		System.out.println(st.getDetails());
	}
}

public class SchoolDemoConstructor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Student Name : ");
		String Name = s.nextLine();
		System.out.println("Enter The Student Branch : ");
		String Branch = s.nextLine();
		System.out.println("Enter The Student Address : ");
		String Add = s.nextLine();
		System.out.println("Enter The Roll No");
		int roll = s.nextInt();
		Student st = new Student(Name,Add,Branch,roll);
		st.getDetails();
		Display2 d = new Display2();
		d.dis(st);

	}

}
