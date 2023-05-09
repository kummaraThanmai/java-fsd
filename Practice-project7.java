package innerclsex;

public class outer {
	public void outermethod() {
		System.out.println("outer method");
	}
	class inner{
		public void innermethod() {
		System.out.println("inner method");

		}
	}
}

class tester{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer.inner a = new outer().new inner();
		a.innermethod();
		
		

	}
}


