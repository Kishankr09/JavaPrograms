package maccess;
import test.*;
import java.util.*;
public class input {
	public int a,b,ch;
	public void inp() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The first Number : "); 
		a = s.nextInt();
		System.out.println("Enter The 2nd Number : ");
		b = s.nextInt();
		System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Mod Division");
		System.out.println("Enter The Choice : ");
		ch = s.nextInt();
		
	}
}
