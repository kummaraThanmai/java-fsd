package methodsexample;

public class Methodsex {
	public int addition(int a, int b) {
		int c = a + b;
		return c;
	}
	public int multi(int a, int b) {
		int d = a*b;
		return d;
		
	}
	public int multi(int a, int b , int e) {
		int f = a*b*e;
		return f;
		
	}

}

class methods{
public static void main(String[] args) {
	// TODO Auto-generated method stub
	int a = 20;
	int b = 20;
	int f = 2;
	//user defined method
	Methodsex obj1 = new Methodsex();
	int result = obj1.addition(a,b);
	System.out.println("sum of a+b = " +result);
	
	
	//predefined method
	System.out.println("square root is:" + Math.sqrt(25));
	
	//method overloading
	int ans = obj1.multi(a,b);
	System.out.println("product of a*b = " +ans);
	int ans1 = obj1.multi(a,b,f);
	System.out.println("product of a*b*e = " +ans1);
	
	
	
	//static method
	display();
	
}
static void display() {
	// TODO Auto-generated method stub
	System.out.println("this is a static method");
	
}


}

