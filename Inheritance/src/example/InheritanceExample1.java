package example;
// This Example is a IS-A-RELATION(Single)
class Animal{
	String name;
	  public void eat() {
	    System.out.println("I can eat");
	  }
}
class Dog extends Animal{
	public void display() {
	    System.out.println("My name is " + name);
	  }
}

public class InheritanceExample1 {

	public static void main(String[] args) {
		Dog labrador = new Dog();
	    labrador.name = "Doggy";
	    labrador.display();
	    labrador.eat();
	}
}
