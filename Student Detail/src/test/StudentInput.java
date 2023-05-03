package test;
import java.util.Scanner;


public class StudentInput {
	public String name,Add,div;
	public int rollNo,m1,m2,m3,m4,m5,total;
	public float per;
	Scanner s = new Scanner(System.in);
	public void input() {
		System.out.println("Enter The Name : ");
		name = s.nextLine();
		System.out.println("Enter The Roll No : ");
		rollNo = Integer.parseInt(s.nextLine());
		System.out.println("Enter The Address : ");
		Add = s.nextLine();
		System.out.println("Enter The 1st Subject marks : ");
		m1 = s.nextInt();
		System.out.println("Enter The 2nd Subject marks : ");
		m2 = s.nextInt();
		System.out.println("Enter The 3rd Subject marks : ");
		m3 = s.nextInt();
		System.out.println("Enter The 4th Subject marks : ");
		m4 = s.nextInt();
		System.out.println("Enter The 5th Subject marks : ");
		m5 = s.nextInt();
		
	}
}
