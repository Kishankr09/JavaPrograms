package maccess;
import test.*;
import java.util.*;
public class DemoMain {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Address ad = new Address();
		Contact c = new Contact();
		Result  res = new Result();
		Student st = new Student(ad,c,res);
		ReadInput ri = new ReadInput();
		ri.read(sc, st);
		Display d = new Display();
		d.show(st);
		sc.close();
	}
}
