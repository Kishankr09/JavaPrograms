package example;
//This is a Example of Multi-Level Inheritence
class School{
	String name;
	public void sch() {
	    System.out.println("School Name is SSM ");
	  }
}
class Student extends School{
	  public void study() {
	    System.out.println("I am Studing ");
	    System.out.println("And My Name is " + name);
	  }
}
class Teacher extends Student{
	Teacher(String N){
		name = N;
	}
	  public void teach() {
	    System.out.println("I am Teaching ");
	    System.out.println("And My Name is " + name);
	  }
}
public class InheritanceExample2 {
	public static void main(String[] args) {
	Teacher tr = new Teacher("Ganesh");
	tr.teach();
	tr.study();
	tr.sch();
	
	}
}
