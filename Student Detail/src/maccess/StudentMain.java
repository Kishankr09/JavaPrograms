package maccess;
import test.*;
public class StudentMain {

	public static void main(String[] args) {
		StudentInput SI = new StudentInput();
		SI.input();
		StudentResult SR = new StudentResult();
		SR.stuRes(SI);
		Display d = new Display();
		d.dis(SI);
	}

}
