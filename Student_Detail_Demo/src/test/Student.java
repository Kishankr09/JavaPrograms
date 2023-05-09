package test;

public class Student {
	public Address addr = null;
	public Contact con = null;
	public Result re = null;
	public String name, branch,res;
	public int rollNo, totMarks;
	public float per;
	public Student(Address ad, Contact co, Result r) {
		addr = ad;
		con = co;
		re = r;
	}
}
