package maccess;
import java.util.*;
import test.*;

public class DemoMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Address ad = new Address();
		Employee e = new Employee(ad);
		Input inp = new Input();
		inp.read(s, e);
		Display d = new Display();
		d.dis(e);
		
		
	}
}
