package constructors;

public class constructorex {
	int id;
	String mail;
	void display() {
		System.out.println(id+" "+mail);
	}
	

public static void main (String args[]) {
	constructorex e1 =new constructorex();
	constructorex e2 =new constructorex();
	e1.display();
	e2.display();
	
	
}
}
