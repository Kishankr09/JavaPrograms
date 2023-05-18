package example;

public class InheritanceExample4{
int id;
String name;
Address address;

public InheritanceExample4(int id, String name,Address address) {
	this.id = id;
	this.name = name;
	this.address=address;
}

void display(){
	System.out.println(id+" "+name);
	System.out.println(address.city+" "+address.state+" "+address.country);
}

	public static void main(String[] args) {
		Address address1=new Address("Rajgir","Bihar","india");
		Address address2=new Address("Gaya","Bihar","india");

		InheritanceExample4 e1=new InheritanceExample4(111,"Kishan",address1);
		InheritanceExample4 e2=new InheritanceExample4(112,"Pankaj",address2);
		
		e1.display();
		e2.display();

	}

}
