package example;

class Ganesh{
	public void GaneshDisplay() {
		System.out.println("My Name is Ganesh i am Friend of Both");
	}
}
class Ramesh extends Ganesh{
	public void RameshDisplay() {
		System.out.println("My Name is Ramesh i am Friend of Ganesh");
	}
}

class Mahesh extends Ganesh{
	public void MaheshDisplay() {
		System.out.println("My Name is Mahesh i am Friend of Ganesh");
	}
}
public class InheritanceExample3 {

	public static void main(String[] args) {
	
		Mahesh gn= new Mahesh();
		gn.GaneshDisplay();
		gn.MaheshDisplay();
		//gn.RameshDisplay(); if we want to access then compile give error "Compile time error"
		Ramesh rm = new Ramesh(); // we have to create two object then we can access.
		
		rm.GaneshDisplay();
		rm.RameshDisplay();		
	}

}
